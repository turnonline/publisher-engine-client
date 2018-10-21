package biz.turnonline.ecosystem.publisher.facade;

import biz.turnonline.ecosystem.publisher.Publisher;
import biz.turnonline.ecosystem.publisher.PublisherScopes;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.ctoolkit.restapi.client.AccessToken;
import org.ctoolkit.restapi.client.ApiToken;
import org.ctoolkit.restapi.client.RemoteServerErrorException;
import org.ctoolkit.restapi.client.UnauthorizedException;
import org.ctoolkit.restapi.client.googleapis.GoogleApiProxyFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Set;

/**
 * The Publisher Content Engine Client guice module as a default configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 * @see PublisherEngineAdapterModule
 */
public class PublisherEngineClientModule
        extends AbstractModule
{
    public static final String API_PREFIX = "publisher";

    private static final Logger logger = LoggerFactory.getLogger( PublisherEngineClientModule.class );

    private ApiToken<? extends HttpRequestInitializer> initialized;

    @Provides
    @Singleton
    Publisher providePublisher( GoogleApiProxyFactory factory )
    {
        Set<String> scopes = PublisherScopes.all();
        Publisher.Builder builder;

        String applicationName = factory.getApplicationName( API_PREFIX );
        String endpointUrl = factory.getEndpointUrl( API_PREFIX );
        String serviceAccount = factory.getServiceAccountEmail( API_PREFIX );

        try
        {
            HttpTransport httpTransport = factory.getHttpTransport();
            initialized = factory.authorize( scopes, null, API_PREFIX );
            HttpRequestInitializer credential = initialized.getCredential();

            builder = new Publisher.Builder( httpTransport, factory.getJsonFactory(), credential )
                    .setApplicationName( applicationName )
                    .setRootUrl( endpointUrl );
        }
        catch ( GeneralSecurityException e )
        {
            logger.error( "Scopes: " + scopes.toString()
                    + " Application name: " + applicationName
                    + " Service account: " + serviceAccount
                    + " Endpoint URL: " + endpointUrl, e );

            throw new UnauthorizedException( e.getMessage() );
        }
        catch ( IOException e )
        {
            logger.error( "Scopes: " + scopes.toString()
                    + " Application name: " + applicationName
                    + " Service account: " + serviceAccount
                    + " Endpoint URL: " + endpointUrl, e );

            throw new RemoteServerErrorException( e.getMessage() );
        }

        return builder.build();
    }

    @Provides
    @AccessToken( apiName = API_PREFIX )
    ApiToken.Data providePublisherApiTokenData( Publisher client )
    {
        initialized.setServiceUrl( client.getBaseUrl() );
        return initialized.getTokenData();
    }
}
