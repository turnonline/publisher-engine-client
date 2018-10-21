package biz.turnonline.ecosystem.publisher.facade.adaptee;

import biz.turnonline.ecosystem.publisher.Publisher;
import biz.turnonline.ecosystem.publisher.model.ContentOwner;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractUpdateExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;

/**
 * The adaptee for {@link ContentOwner}.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class ContentOwnerAdaptee
        extends AbstractUpdateExecutorAdaptee<Publisher, ContentOwner>
{
    @Inject
    public ContentOwnerAdaptee( Publisher client )
    {
        super( client );
    }

    @Override
    public Object prepareUpdate( @Nonnull ContentOwner resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        return client().owner().update( identifier.getLong(), resource );
    }
}
