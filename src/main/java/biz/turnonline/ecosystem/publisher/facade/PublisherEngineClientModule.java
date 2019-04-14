package biz.turnonline.ecosystem.publisher.facade;

import biz.turnonline.ecosystem.publisher.PublisherEngine;
import com.google.inject.AbstractModule;

/**
 * The Publisher &amp; Content Engine Client guice module as a default configuration.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 * @see PublisherEngineAdapterModule
 */
public class PublisherEngineClientModule
        extends AbstractModule
{
    public static final String API_PREFIX = "publisher";

    @Override
    protected void configure()
    {
        bind( PublisherEngine.class ).toProvider( PublisherEngineProvider.class );
    }
}
