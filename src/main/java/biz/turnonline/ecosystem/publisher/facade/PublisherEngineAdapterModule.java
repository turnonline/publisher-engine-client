/*
 * Copyright (c) 2020 TurnOnline.biz s.r.o.
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

import biz.turnonline.ecosystem.publisher.facade.adaptee.EmailPayloadAdaptee;
import biz.turnonline.ecosystem.publisher.model.EmailPayload;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import org.ctoolkit.restapi.client.adaptee.InsertExecutorAdaptee;

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
        // PayInvoiceContent
        bind( new TypeLiteral<InsertExecutorAdaptee<EmailPayload>>()
        {
        } ).to( EmailPayloadAdaptee.class ).in( Singleton.class );
    }
}
