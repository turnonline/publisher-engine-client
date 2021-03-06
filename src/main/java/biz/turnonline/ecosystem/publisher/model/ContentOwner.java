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
 * Model definition for ContentOwner.
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
public final class ContentOwner
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long accountId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String analyticsAccount;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String businessName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String city;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String companyId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String contactEmail;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String contactWebSite;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String country;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String domain;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String domicile;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String email;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> gateways;

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
    @com.google.api.client.json.JsonString
    private java.lang.Long id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double latitude;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String legalForm;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String locale;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String logoUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double longitude;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String paymentLink;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String postcode;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String street;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> supportedLocales;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String taxId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String vatId;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean vatPayer;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getAccountId()
    {
        return accountId;
    }

    /**
     * @param accountId accountId or {@code null} for none
     */
    public ContentOwner setAccountId( java.lang.Long accountId )
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getAnalyticsAccount()
    {
        return analyticsAccount;
    }

    /**
     * @param analyticsAccount analyticsAccount or {@code null} for none
     */
    public ContentOwner setAnalyticsAccount( java.lang.String analyticsAccount )
    {
        this.analyticsAccount = analyticsAccount;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getBusinessName()
    {
        return businessName;
    }

    /**
     * @param businessName businessName or {@code null} for none
     */
    public ContentOwner setBusinessName( java.lang.String businessName )
    {
        this.businessName = businessName;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCity()
    {
        return city;
    }

    /**
     * @param city city or {@code null} for none
     */
    public ContentOwner setCity( java.lang.String city )
    {
        this.city = city;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCompanyId()
    {
        return companyId;
    }

    /**
     * @param companyId companyId or {@code null} for none
     */
    public ContentOwner setCompanyId( java.lang.String companyId )
    {
        this.companyId = companyId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getContactEmail()
    {
        return contactEmail;
    }

    /**
     * @param contactEmail contactEmail or {@code null} for none
     */
    public ContentOwner setContactEmail( java.lang.String contactEmail )
    {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getContactWebSite()
    {
        return contactWebSite;
    }

    /**
     * @param contactWebSite contactWebSite or {@code null} for none
     */
    public ContentOwner setContactWebSite( java.lang.String contactWebSite )
    {
        this.contactWebSite = contactWebSite;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getCountry()
    {
        return country;
    }

    /**
     * @param country country or {@code null} for none
     */
    public ContentOwner setCountry( java.lang.String country )
    {
        this.country = country;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDomain()
    {
        return domain;
    }

    /**
     * @param domain domain or {@code null} for none
     */
    public ContentOwner setDomain( java.lang.String domain )
    {
        this.domain = domain;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDomicile()
    {
        return domicile;
    }

    /**
     * @param domicile domicile or {@code null} for none
     */
    public ContentOwner setDomicile( java.lang.String domicile )
    {
        this.domicile = domicile;
        return this;
    }

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
    public ContentOwner setEmail( java.lang.String email )
    {
        this.email = email;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getGateways()
    {
        return gateways;
    }

    /**
     * @param gateways gateways or {@code null} for none
     */
    public ContentOwner setGateways( java.util.List<java.lang.String> gateways )
    {
        this.gateways = gateways;
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
    public ContentOwner setHeaderDescription( java.lang.String headerDescription )
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
    public ContentOwner setHeaderKeywords( java.lang.String headerKeywords )
    {
        this.headerKeywords = headerKeywords;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getId()
    {
        return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public ContentOwner setId( java.lang.Long id )
    {
        this.id = id;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getLatitude()
    {
        return latitude;
    }

    /**
     * @param latitude latitude or {@code null} for none
     */
    public ContentOwner setLatitude( java.lang.Double latitude )
    {
        this.latitude = latitude;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLegalForm()
    {
        return legalForm;
    }

    /**
     * @param legalForm legalForm or {@code null} for none
     */
    public ContentOwner setLegalForm( java.lang.String legalForm )
    {
        this.legalForm = legalForm;
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
    public ContentOwner setLocale( java.lang.String locale )
    {
        this.locale = locale;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLogoUrl()
    {
        return logoUrl;
    }

    /**
     * @param logoUrl logoUrl or {@code null} for none
     */
    public ContentOwner setLogoUrl( java.lang.String logoUrl )
    {
        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getLongitude()
    {
        return longitude;
    }

    /**
     * @param longitude longitude or {@code null} for none
     */
    public ContentOwner setLongitude( java.lang.Double longitude )
    {
        this.longitude = longitude;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPaymentLink()
    {
        return paymentLink;
    }

    /**
     * @param paymentLink paymentLink or {@code null} for none
     */
    public ContentOwner setPaymentLink( java.lang.String paymentLink )
    {
        this.paymentLink = paymentLink;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPostcode()
    {
        return postcode;
    }

    /**
     * @param postcode postcode or {@code null} for none
     */
    public ContentOwner setPostcode( java.lang.String postcode )
    {
        this.postcode = postcode;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStreet()
    {
        return street;
    }

    /**
     * @param street street or {@code null} for none
     */
    public ContentOwner setStreet( java.lang.String street )
    {
        this.street = street;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getSupportedLocales()
    {
        return supportedLocales;
    }

    /**
     * @param supportedLocales supportedLocales or {@code null} for none
     */
    public ContentOwner setSupportedLocales( java.util.List<java.lang.String> supportedLocales )
    {
        this.supportedLocales = supportedLocales;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getTaxId()
    {
        return taxId;
    }

    /**
     * @param taxId taxId or {@code null} for none
     */
    public ContentOwner setTaxId( java.lang.String taxId )
    {
        this.taxId = taxId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVatId()
    {
        return vatId;
    }

    /**
     * @param vatId vatId or {@code null} for none
     */
    public ContentOwner setVatId( java.lang.String vatId )
    {
        this.vatId = vatId;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getVatPayer()
    {
        return vatPayer;
    }

    /**
     * @param vatPayer vatPayer or {@code null} for none
     */
    public ContentOwner setVatPayer( java.lang.Boolean vatPayer )
    {
        this.vatPayer = vatPayer;
        return this;
    }

    @Override
    public ContentOwner set( String fieldName, Object value )
    {
        return ( ContentOwner ) super.set( fieldName, value );
    }

    @Override
    public ContentOwner clone()
    {
        return ( ContentOwner ) super.clone();
    }

}
