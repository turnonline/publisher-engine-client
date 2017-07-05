package biz.turnonline.publisher.client.adaptee;

import biz.turnonline.publisher.publisher.Publisher;
import biz.turnonline.publisher.publisher.model.ProductContent;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/**
 * The adaptee for {@link ProductContent}.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class ProductContentAdaptee
        extends AbstractGoogleClientAdaptee<Publisher>
        implements UpdateExecutorAdaptee<ProductContent>, DeleteExecutorAdaptee<ProductContent>
{
    @Inject
    public ProductContentAdaptee( Publisher client )
    {
        super( client );
    }

    @Override
    public Object prepareUpdate( @Nonnull ProductContent resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        return client().product().update( identifier.getLong(), identifier.child().getString(), resource );
    }

    @Override
    public Object executeUpdate( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale )
            throws IOException
    {
        return execute( request, parameters, locale );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        return client().product().delete( identifier.getLong(), identifier.child().getString() );
    }

    @Override
    public void executeDelete( @Nonnull Object request,
                               @Nullable Map<String, Object> parameters,
                               @Nullable Locale locale )
            throws IOException
    {
        execute( request, parameters, locale );
    }
}
