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
 * Model definition for EventPart.
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
public final class EventPart
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String description;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer order;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double priceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDescription()
    {
        return description;
    }

    /**
     * @param description description or {@code null} for none
     */
    public EventPart setDescription( java.lang.String description )
    {
        this.description = description;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getFinalPrice()
    {
        return finalPrice;
    }

    /**
     * @param finalPrice finalPrice or {@code null} for none
     */
    public EventPart setFinalPrice( java.lang.Double finalPrice )
    {
        this.finalPrice = finalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getOrder()
    {
        return order;
    }

    /**
     * @param order order or {@code null} for none
     */
    public EventPart setOrder( java.lang.Integer order )
    {
        this.order = order;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getPriceExclVat()
    {
        return priceExclVat;
    }

    /**
     * @param priceExclVat priceExclVat or {@code null} for none
     */
    public EventPart setPriceExclVat( java.lang.Double priceExclVat )
    {
        this.priceExclVat = priceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle()
    {
        return title;
    }

    /**
     * @param title title or {@code null} for none
     */
    public EventPart setTitle( java.lang.String title )
    {
        this.title = title;
        return this;
    }

    @Override
    public EventPart set( String fieldName, Object value )
    {
        return ( EventPart ) super.set( fieldName, value );
    }

    @Override
    public EventPart clone()
    {
        return ( EventPart ) super.clone();
    }

}
