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
 * Model definition for TermsContent.
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
public final class TermsContent
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String fullTerms;

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
    private java.lang.String locale;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getFullTerms()
    {
        return fullTerms;
    }

    /**
     * @param fullTerms fullTerms or {@code null} for none
     */
    public TermsContent setFullTerms( java.lang.String fullTerms )
    {
        this.fullTerms = fullTerms;
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
    public TermsContent setHeaderDescription( java.lang.String headerDescription )
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
    public TermsContent setHeaderKeywords( java.lang.String headerKeywords )
    {
        this.headerKeywords = headerKeywords;
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
    public TermsContent setLocale( java.lang.String locale )
    {
        this.locale = locale;
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
    public TermsContent setTitle( java.lang.String title )
    {
        this.title = title;
        return this;
    }

    @Override
    public TermsContent set( String fieldName, Object value )
    {
        return ( TermsContent ) super.set( fieldName, value );
    }

    @Override
    public TermsContent clone()
    {
        return ( TermsContent ) super.clone();
    }

}
