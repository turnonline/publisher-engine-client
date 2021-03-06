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
 * Model definition for PayInvoiceContent.
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
public final class PayInvoiceContent
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double amountPay;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String applyReverseChargeText;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String constantSymbol;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String currency;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String hashCode;

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
    private java.lang.String invoiceImageUrl;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String invoiceKey;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    @com.google.api.client.json.JsonString
    private java.lang.Long issuedFor;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String locale;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String paymentKey;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalPrice;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Double totalPriceExclVat;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String variableSymbol;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getAmountPay()
    {
        return amountPay;
    }

    /**
     * @param amountPay amountPay or {@code null} for none
     */
    public PayInvoiceContent setAmountPay( java.lang.Double amountPay )
    {
        this.amountPay = amountPay;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getApplyReverseChargeText()
    {
        return applyReverseChargeText;
    }

    /**
     * @param applyReverseChargeText applyReverseChargeText or {@code null} for none
     */
    public PayInvoiceContent setApplyReverseChargeText( java.lang.String applyReverseChargeText )
    {
        this.applyReverseChargeText = applyReverseChargeText;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getConstantSymbol()
    {
        return constantSymbol;
    }

    /**
     * @param constantSymbol constantSymbol or {@code null} for none
     */
    public PayInvoiceContent setConstantSymbol( java.lang.String constantSymbol )
    {
        this.constantSymbol = constantSymbol;
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
    public PayInvoiceContent setCurrency( java.lang.String currency )
    {
        this.currency = currency;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getHashCode()
    {
        return hashCode;
    }

    /**
     * @param hashCode hashCode or {@code null} for none
     */
    public PayInvoiceContent setHashCode( java.lang.String hashCode )
    {
        this.hashCode = hashCode;
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
    public PayInvoiceContent setHeaderDescription( java.lang.String headerDescription )
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
    public PayInvoiceContent setHeaderKeywords( java.lang.String headerKeywords )
    {
        this.headerKeywords = headerKeywords;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getInvoiceImageUrl()
    {
        return invoiceImageUrl;
    }

    /**
     * @param invoiceImageUrl invoiceImageUrl or {@code null} for none
     */
    public PayInvoiceContent setInvoiceImageUrl( java.lang.String invoiceImageUrl )
    {
        this.invoiceImageUrl = invoiceImageUrl;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getInvoiceKey()
    {
        return invoiceKey;
    }

    /**
     * @param invoiceKey invoiceKey or {@code null} for none
     */
    public PayInvoiceContent setInvoiceKey( java.lang.String invoiceKey )
    {
        this.invoiceKey = invoiceKey;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Long getIssuedFor()
    {
        return issuedFor;
    }

    /**
     * @param issuedFor issuedFor or {@code null} for none
     */
    public PayInvoiceContent setIssuedFor( java.lang.Long issuedFor )
    {
        this.issuedFor = issuedFor;
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
    public PayInvoiceContent setLocale( java.lang.String locale )
    {
        this.locale = locale;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getPaymentKey()
    {
        return paymentKey;
    }

    /**
     * @param paymentKey paymentKey or {@code null} for none
     */
    public PayInvoiceContent setPaymentKey( java.lang.String paymentKey )
    {
        this.paymentKey = paymentKey;
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
    public PayInvoiceContent setTitle( java.lang.String title )
    {
        this.title = title;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * @param totalPrice totalPrice or {@code null} for none
     */
    public PayInvoiceContent setTotalPrice( java.lang.Double totalPrice )
    {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Double getTotalPriceExclVat()
    {
        return totalPriceExclVat;
    }

    /**
     * @param totalPriceExclVat totalPriceExclVat or {@code null} for none
     */
    public PayInvoiceContent setTotalPriceExclVat( java.lang.Double totalPriceExclVat )
    {
        this.totalPriceExclVat = totalPriceExclVat;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getVariableSymbol()
    {
        return variableSymbol;
    }

    /**
     * @param variableSymbol variableSymbol or {@code null} for none
     */
    public PayInvoiceContent setVariableSymbol( java.lang.String variableSymbol )
    {
        this.variableSymbol = variableSymbol;
        return this;
    }

    @Override
    public PayInvoiceContent set( String fieldName, Object value )
    {
        return ( PayInvoiceContent ) super.set( fieldName, value );
    }

    @Override
    public PayInvoiceContent clone()
    {
        return ( PayInvoiceContent ) super.clone();
    }

}
