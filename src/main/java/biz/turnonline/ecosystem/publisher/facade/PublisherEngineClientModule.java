/*
 * Copyright (c) 2022 TurnOnline.biz s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.turnonline.ecosystem.publisher.facade;

import biz.turnonline.ecosystem.publisher.PublisherEngine;
import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import org.ctoolkit.restapi.client.adapter.ClientApi;

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

        MapBinder<String, ClientApi> mapBinder;
        mapBinder = MapBinder.newMapBinder( binder(), String.class, ClientApi.class );
        mapBinder.addBinding( API_PREFIX ).to( PublisherEngineProvider.class );
    }
}
