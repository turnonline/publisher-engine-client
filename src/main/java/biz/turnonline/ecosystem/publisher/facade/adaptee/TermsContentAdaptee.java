package biz.turnonline.ecosystem.publisher.facade.adaptee;

import biz.turnonline.ecosystem.publisher.PublisherEngine;
import biz.turnonline.ecosystem.publisher.model.TermsContent;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.MediaProvider;
import org.ctoolkit.restapi.client.adapter.AbstractUpdateExecutorAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import java.io.IOException;

/**
 * The adaptee for {@link TermsContent}.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class TermsContentAdaptee
        extends AbstractUpdateExecutorAdaptee<PublisherEngine, TermsContent>
{
    @Inject
    public TermsContentAdaptee( PublisherEngine client )
    {
        super( client );
    }

    @Override
    public Object prepareUpdate( @Nonnull TermsContent resource,
                                 @Nonnull Identifier identifier,
                                 @Nullable MediaProvider provider )
            throws IOException
    {
        return client().terms().update( identifier.getLong(), resource );
    }
}
