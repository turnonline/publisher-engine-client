/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package biz.turnonline.ecosystem.publisher.model;

/**
 * Model definition for EmailPayloadContent.
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
public final class EmailPayloadContent
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String body;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBody()
    {
        return body;
    }

    /**
     * @param body body or {@code null} for none
     */
    public EmailPayloadContent setBody( java.lang.String body )
    {
        this.body = body;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getType()
    {
        return type;
    }

    /**
     * @param type type or {@code null} for none
     */
    public EmailPayloadContent setType( java.lang.String type )
    {
        this.type = type;
        return this;
    }

    @Override
    public EmailPayloadContent set( String fieldName, Object value )
    {
        return ( EmailPayloadContent ) super.set( fieldName, value );
    }

    @Override
    public EmailPayloadContent clone()
    {
        return ( EmailPayloadContent ) super.clone();
    }

}
