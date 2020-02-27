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

package biz.turnonline.ecosystem.publisher.model;

/**
 * Model definition for MapStringObject.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Publisher &amp; Content Engine. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class MapStringObject
        extends com.google.api.client.json.GenericJson
{

    @Override
    public MapStringObject set( String fieldName, Object value )
    {
        return ( MapStringObject ) super.set( fieldName, value );
    }

    @Override
    public MapStringObject clone()
    {
        return ( MapStringObject ) super.clone();
    }

}
