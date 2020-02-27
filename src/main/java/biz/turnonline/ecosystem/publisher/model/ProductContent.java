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
 * Model definition for ProductContent.
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
public final class ProductContent
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double altFinalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double altFinalPriceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean altPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean comingSoon;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String description;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private EventContent event;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double finalPriceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String headerDescription;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String headerKeywords;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String imageLegend;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String imageTitle;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String imageUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String locale;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long productId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String productName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String snippet;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.Map<String, java.lang.Object> subsidiary;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getAltFinalPrice()
    {
        return altFinalPrice;
    }

    /**
     * @param altFinalPrice altFinalPrice or {@code null} for none
     */
    public ProductContent setAltFinalPrice( java.lang.Double altFinalPrice )
    {
        this.altFinalPrice = altFinalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getAltFinalPriceExclVat()
    {
        return altFinalPriceExclVat;
    }

    /**
     * @param altFinalPriceExclVat altFinalPriceExclVat or {@code null} for none
     */
    public ProductContent setAltFinalPriceExclVat( java.lang.Double altFinalPriceExclVat )
    {
        this.altFinalPriceExclVat = altFinalPriceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getAltPrice()
    {
        return altPrice;
    }

    /**
     * @param altPrice altPrice or {@code null} for none
     */
    public ProductContent setAltPrice( java.lang.Boolean altPrice )
    {
        this.altPrice = altPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getComingSoon()
    {
        return comingSoon;
    }

    /**
     * @param comingSoon comingSoon or {@code null} for none
     */
    public ProductContent setComingSoon( java.lang.Boolean comingSoon )
    {
        this.comingSoon = comingSoon;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCurrency()
    {
        return currency;
    }

    /**
     * @param currency currency or {@code null} for none
     */
    public ProductContent setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

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
    public ProductContent setDescription( java.lang.String description )
    {
        this.description = description;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public EventContent getEvent()
    {
        return event;
    }

    /**
     * @param event event or {@code null} for none
     */
    public ProductContent setEvent( EventContent event )
    {
        this.event = event;
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
    public ProductContent setFinalPrice( java.lang.Double finalPrice )
    {
        this.finalPrice = finalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getFinalPriceExclVat()
    {
        return finalPriceExclVat;
    }

    /**
     * @param finalPriceExclVat finalPriceExclVat or {@code null} for none
     */
    public ProductContent setFinalPriceExclVat( java.lang.Double finalPriceExclVat )
    {
        this.finalPriceExclVat = finalPriceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getHeaderDescription()
    {
        return headerDescription;
    }

    /**
     * @param headerDescription headerDescription or {@code null} for none
     */
    public ProductContent setHeaderDescription( java.lang.String headerDescription )
    {
        this.headerDescription = headerDescription;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getHeaderKeywords()
    {
        return headerKeywords;
    }

    /**
     * @param headerKeywords headerKeywords or {@code null} for none
     */
    public ProductContent setHeaderKeywords( java.lang.String headerKeywords )
    {
        this.headerKeywords = headerKeywords;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getImageLegend()
    {
        return imageLegend;
    }

    /**
     * @param imageLegend imageLegend or {@code null} for none
     */
    public ProductContent setImageLegend( java.lang.String imageLegend )
    {
        this.imageLegend = imageLegend;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getImageTitle()
    {
        return imageTitle;
    }

    /**
     * @param imageTitle imageTitle or {@code null} for none
     */
    public ProductContent setImageTitle( java.lang.String imageTitle )
    {
        this.imageTitle = imageTitle;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getImageUrl()
    {
        return imageUrl;
    }

    /**
     * @param imageUrl imageUrl or {@code null} for none
     */
    public ProductContent setImageUrl( java.lang.String imageUrl )
    {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLocale()
    {
        return locale;
    }

    /**
     * @param locale locale or {@code null} for none
     */
    public ProductContent setLocale( java.lang.String locale )
    {
        this.locale = locale;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getProductId()
    {
        return productId;
    }

    /**
     * @param productId productId or {@code null} for none
     */
    public ProductContent setProductId( java.lang.Long productId )
    {
        this.productId = productId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getProductName()
    {
        return productName;
    }

    /**
     * @param productName productName or {@code null} for none
     */
    public ProductContent setProductName( java.lang.String productName )
    {
        this.productName = productName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getSnippet()
    {
        return snippet;
    }

    /**
     * @param snippet snippet or {@code null} for none
     */
    public ProductContent setSnippet( java.lang.String snippet )
    {
        this.snippet = snippet;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.Map<String, java.lang.Object> getSubsidiary()
    {
        return subsidiary;
    }

    /**
     * @param subsidiary subsidiary or {@code null} for none
     */
    public ProductContent setSubsidiary( java.util.Map<String, java.lang.Object> subsidiary )
    {
        this.subsidiary = subsidiary;
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
    public ProductContent setTitle( java.lang.String title )
    {
        this.title = title;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl()
    {
        return url;
    }

    /**
     * @param url url or {@code null} for none
     */
    public ProductContent setUrl( java.lang.String url )
    {
        this.url = url;
        return this;
    }

    @Override
    public ProductContent set( String fieldName, Object value )
    {
        return ( ProductContent ) super.set( fieldName, value );
    }

    @Override
    public ProductContent clone()
    {
        return ( ProductContent ) super.clone();
    }

}
