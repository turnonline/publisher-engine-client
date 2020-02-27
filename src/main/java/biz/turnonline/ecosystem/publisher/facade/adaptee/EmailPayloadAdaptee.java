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
