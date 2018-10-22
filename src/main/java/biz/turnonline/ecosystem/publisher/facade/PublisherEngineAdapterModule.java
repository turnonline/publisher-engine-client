package biz.turnonline.ecosystem.publisher.facade;

import biz.turnonline.ecosystem.publisher.facade.adaptee.ContentOwnerAdaptee;
import biz.turnonline.ecosystem.publisher.facade.adaptee.EmailPayloadAdaptee;
import biz.turnonline.ecosystem.publisher.facade.adaptee.PayInvoiceContentAdaptee;
import biz.turnonline.ecosystem.publisher.facade.adaptee.ProductContentAdaptee;
import biz.turnonline.ecosystem.publisher.facade.adaptee.TermsContentAdaptee;
import biz.turnonline.ecosystem.publisher.model.ContentOwner;
import biz.turnonline.ecosystem.publisher.model.EmailPayload;
import biz.turnonline.ecosystem.publisher.model.PayInvoiceContent;
import biz.turnonline.ecosystem.publisher.model.ProductContent;
import biz.turnonline.ecosystem.publisher.model.TermsContent;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;
import org.ctoolkit.restapi.client.adaptee.UpdateExecutorAdaptee;

import javax.inject.Singleton;

/**
 * The Publisher &amp; Content Engine guice default adaptee configuration.
 *
 * @author <a href="mailto:aurel.medvegy@ctoolkit.org">Aurel Medvegy</a>
 */
public class PublisherEngineAdapterModule
        extends AbstractModule
{
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


        // PayInvoiceContent
        bind( new TypeLiteral<InsertExecutorAdaptee<EmailPayload>>()
        {
        } ).to( EmailPayloadAdaptee.class ).in( Singleton.class );
    }
}
