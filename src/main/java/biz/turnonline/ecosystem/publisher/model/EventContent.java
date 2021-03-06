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
 * Model definition for EventContent.
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
public final class EventContent
        extends com.google.api.client.json.GenericJson
{

    static
    {
        // hack to force ProGuard to consider EventPart used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( EventPart.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EventContentBegin begin;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime deadline;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EventContentEnd end;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EventLocation location;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<EventPart> parts;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer seats;

    /**
     * @return value or {@code null} for none
     */
    public EventContentBegin getBegin()
    {
        return begin;
    }

    /**
     * @param begin begin or {@code null} for none
     */
    public EventContent setBegin( EventContentBegin begin )
    {
        this.begin = begin;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public com.google.api.client.util.DateTime getDeadline()
    {
        return deadline;
    }

    /**
     * @param deadline deadline or {@code null} for none
     */
    public EventContent setDeadline( com.google.api.client.util.DateTime deadline )
    {
        this.deadline = deadline;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public EventContentEnd getEnd()
    {
        return end;
    }

    /**
     * @param end end or {@code null} for none
     */
    public EventContent setEnd( EventContentEnd end )
    {
        this.end = end;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public EventLocation getLocation()
    {
        return location;
    }

    /**
     * @param location location or {@code null} for none
     */
    public EventContent setLocation( EventLocation location )
    {
        this.location = location;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<EventPart> getParts()
    {
        return parts;
    }

    /**
     * @param parts parts or {@code null} for none
     */
    public EventContent setParts( java.util.List<EventPart> parts )
    {
        this.parts = parts;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getSeats()
    {
        return seats;
    }

    /**
     * @param seats seats or {@code null} for none
     */
    public EventContent setSeats( java.lang.Integer seats )
    {
        this.seats = seats;
        return this;
    }

    @Override
    public EventContent set( String fieldName, Object value )
    {
        return ( EventContent ) super.set( fieldName, value );
    }

    @Override
    public EventContent clone()
    {
        return ( EventContent ) super.clone();
    }

}
