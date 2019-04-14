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
 * on 2019-01-10 at 20:24:40 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.publisher.model;

/**
 * Model definition for EventContentBegin.
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
public final class EventContentBegin
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer from;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime on;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean show;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer to;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getFrom()
    {
        return from;
    }

    /**
     * @param from from or {@code null} for none
     */
    public EventContentBegin setFrom( java.lang.Integer from )
    {
        this.from = from;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getOn()
    {
        return on;
    }

    /**
     * @param on on or {@code null} for none
     */
    public EventContentBegin setOn( com.google.api.client.util.DateTime on )
    {
        this.on = on;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getShow()
    {
        return show;
    }

    /**
     * @param show show or {@code null} for none
     */
    public EventContentBegin setShow( java.lang.Boolean show )
    {
        this.show = show;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getTo()
    {
        return to;
    }

    /**
     * @param to to or {@code null} for none
     */
    public EventContentBegin setTo( java.lang.Integer to )
    {
        this.to = to;
        return this;
    }

    @Override
    public EventContentBegin set( String fieldName, Object value )
    {
        return ( EventContentBegin ) super.set( fieldName, value );
    }

    @Override
    public EventContentBegin clone()
    {
        return ( EventContentBegin ) super.clone();
    }

}
