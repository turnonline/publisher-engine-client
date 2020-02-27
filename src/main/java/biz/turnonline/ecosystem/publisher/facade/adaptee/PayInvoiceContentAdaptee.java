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

package biz.turnonline.ecosystem.publisher.facade.adaptee;

import biz.turnonline.ecosystem.publisher.PublisherEngine;
import biz.turnonline.ecosystem.publisher.model.PayInvoiceContent;
import org.ctoolkit.restapi.client.Identifier;
import org.ctoolkit.restapi.client.adaptee.DeleteExecutorAdaptee;
import org.ctoolkit.restapi.client.adapter.AbstractGoogleClientAdaptee;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Provider;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/**
 * The adaptee for {@link PayInvoiceContent}.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class PayInvoiceContentAdaptee
        extends AbstractGoogleClientAdaptee<PublisherEngine>
        implements DeleteExecutorAdaptee<PayInvoiceContent>
{
    @Inject
    public PayInvoiceContentAdaptee( Provider<PublisherEngine> client )
    {
        super( client );
    }

    @Override
    public Object prepareDelete( @Nonnull Identifier identifier ) throws IOException
    {
        return client().invoice().delete( identifier.getLong(), identifier.child().getString() );
    }

    @Override
    public Object executeDelete( @Nonnull Object request,
                                 @Nullable Map<String, Object> parameters,
                                 @Nullable Locale locale )
            throws IOException
    {
        return execute( request, parameters );
    }
}
