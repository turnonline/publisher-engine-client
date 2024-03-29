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
 * Model definition for EmailRecipients.
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
public final class EmailRecipients
        extends com.google.api.client.json.GenericJson
{

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<EmailRecipient> bcc;

    static
    {
        // hack to force ProGuard to consider EmailRecipient used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( EmailRecipient.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<EmailRecipient> cc;

    static
    {
        // hack to force ProGuard to consider EmailRecipient used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( EmailRecipient.class );
    }

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<EmailRecipient> to;

    static
    {
        // hack to force ProGuard to consider EmailRecipient used, since otherwise it would be stripped out
        // see https://github.com/google/google-api-java-client/issues/543
        com.google.api.client.util.Data.nullOf( EmailRecipient.class );
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<EmailRecipient> getBcc()
    {
        return bcc;
    }

    /**
     * @param bcc bcc or {@code null} for none
     */
    public EmailRecipients setBcc( java.util.List<EmailRecipient> bcc )
    {
        this.bcc = bcc;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<EmailRecipient> getCc()
    {
        return cc;
    }

    /**
     * @param cc cc or {@code null} for none
     */
    public EmailRecipients setCc( java.util.List<EmailRecipient> cc )
    {
        this.cc = cc;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.util.List<EmailRecipient> getTo()
    {
        return to;
    }

    /**
     * @param to to or {@code null} for none
     */
    public EmailRecipients setTo( java.util.List<EmailRecipient> to )
    {
        this.to = to;
        return this;
    }

    @Override
    public EmailRecipients set( String fieldName, Object value )
    {
        return ( EmailRecipients ) super.set( fieldName, value );
    }

    @Override
    public EmailRecipients clone()
    {
        return ( EmailRecipients ) super.clone();
    }

}
