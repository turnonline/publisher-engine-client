package biz.turnonline.publisher.client.adaptee;

import biz.turnonline.publisher.publisher.Publisher;
import biz.turnonline.publisher.publisher.model.TermsContent;
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
        extends AbstractUpdateExecutorAdaptee<Publisher, TermsContent>
{
    @Inject
    public TermsContentAdaptee( Publisher client )
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
