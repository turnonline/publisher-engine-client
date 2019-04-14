package biz.turnonline.ecosystem.publisher.facade.adaptee;

import biz.turnonline.ecosystem.publisher.PublisherEngine;
import biz.turnonline.ecosystem.publisher.model.EmailPayload;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractInsertExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;

/**
 * The adaptee for {@link EmailPayload}.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class EmailPayloadAdaptee
        extends AbstractInsertExecutorAdaptee<PublisherEngine, EmailPayload>
{
    @Inject
    public EmailPayloadAdaptee( Provider<PublisherEngine> client )
    {
        super( client );
    }

    @Override
    public Object prepareInsert( @Nonnull EmailPayload resource,
                                 @Nullable Identifier parentKey,
                                 @Nullable MediaProvider provider ) throws IOException
    {
        if ( parentKey == null )
        {
            throw new IllegalArgumentException( "'login_id' (Long) and 'name' (String) is being expected as Identifier" );
        }

        if ( !parentKey.hasChild() )
        {
            throw new IllegalArgumentException( "'name' (String) is being expected as next Identifier" );
        }

        Long loginId = parentKey.getLong();
        String name = parentKey.child().getString();

        return client().owner().email( loginId, name, resource );
    }
}
