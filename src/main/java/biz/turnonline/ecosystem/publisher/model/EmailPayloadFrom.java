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
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-10-08 17:45:39 UTC)
 * on 2018-10-21 at 06:46:23 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.publisher.model;

/**
 * Model definition for EmailPayloadFrom.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the TurnOnline.biz Publisher & Content Engine. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings( "javadoc" )
public final class EmailPayloadFrom
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String email;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getEmail()
    {
        return email;
    }

    /**
     * @param email email or {@code null} for none
     */
    public EmailPayloadFrom setEmail( java.lang.String email )
    {
        this.email = email;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName()
    {
        return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public EmailPayloadFrom setName( java.lang.String name )
    {
        this.name = name;
        return this;
    }

    @Override
    public EmailPayloadFrom set( String fieldName, Object value )
    {
        return ( EmailPayloadFrom ) super.set( fieldName, value );
    }

    @Override
    public EmailPayloadFrom clone()
    {
        return ( EmailPayloadFrom ) super.clone();
    }

}
