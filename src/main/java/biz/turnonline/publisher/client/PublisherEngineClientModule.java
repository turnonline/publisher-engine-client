package biz.turnonline.publisher.client;

import biz.turnonline.publisher.client.adaptee.ContentOwnerAdaptee;
import biz.turnonline.publisher.client.adaptee.PayInvoiceContentAdaptee;
import biz.turnonline.publisher.client.adaptee.ProductContentAdaptee;
import biz.turnonline.publisher.client.adaptee.TermsContentAdaptee;
import biz.turnonline.publisher.publisher.Publisher;
import biz.turnonline.publisher.publisher.PublisherScopes;
import biz.turnonline.publisher.publisher.model.ContentOwner;
import biz.turnonline.publisher.publisher.model.PayInvoiceContent;
import biz.turnonline.publisher.publisher.model.ProductContent;
import biz.turnonline.publisher.publisher.model.TermsContent;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.AccessToken;
import org.ctoolkit.restapi.client.ApiToken;
import org.ctoolkit.restapi.client.RemoteServerErrorException;
import org.ctoolkit.restapi.client.UnauthorizedException;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;
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
 */
public class PublisherEngineClientModule
        extends AbstractModule
{
    public static final String API_PREFIX = "publisher-engine";

    private static final Logger logger = LoggerFactory.getLogger( PublisherEngineClientModule.class );

    private ApiToken<? extends HttpRequestInitializer> initialized;

    @Override
    protected void configure()
    {
        // ContentOwner
        bind( new TypeLiteral<UpdateExecutorAdaptee<ContentOwner>>()
        {
        } ).to( ContentOwnerAdaptee.class ).in( Singleton.class );

        // PayInvoiceContent
        bind( new TypeLiteral<UpdateExecutorAdaptee<PayInvoiceContent>>()
        {
        } ).to( PayInvoiceContentAdaptee.class ).in( Singleton.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<PayInvoiceContent>>()
        {
        } ).to( PayInvoiceContentAdaptee.class ).in( Singleton.class );

        // ProductContent
        bind( new TypeLiteral<UpdateExecutorAdaptee<ProductContent>>()
        {
        } ).to( ProductContentAdaptee.class ).in( Singleton.class );

        bind( new TypeLiteral<DeleteExecutorAdaptee<ProductContent>>()
        {
        } ).to( ProductContentAdaptee.class ).in( Singleton.class );

        // ContentOwner
        bind( new TypeLiteral<UpdateExecutorAdaptee<TermsContent>>()
        {
        } ).to( TermsContentAdaptee.class ).in( Singleton.class );
    }

    @Provides
    @Singleton
    Publisher provideCtoolkitBroker( GoogleApiProxyFactory factory )
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

            throw new RemoteServerErrorException( HttpStatusCodes.STATUS_CODE_SERVER_ERROR, e.getMessage() );
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
