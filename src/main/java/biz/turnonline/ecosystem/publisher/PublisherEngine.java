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
 * on 2019-04-14 at 05:57:24 UTC
 * Modify at your own risk.
 */

package biz.turnonline.ecosystem.publisher;

/**
 * Service definition for PublisherEngine (v1).
 *
 * <p>
 * TurnOnline.biz Ecosystem: Publisher & Content Engine microservice responsible for the content preparation and make it available for a third-parties.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.turnonline.biz/docs/publisher.turnon.cloud/1" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link PublisherEngineRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @author Google, Inc.
 * @since 1.3
 */
@SuppressWarnings( "javadoc" )
public class PublisherEngine
        extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
{

    /**
     * The default encoded root URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_ROOT_URL = "https://publisher-engine-dot-turn-online-eu.appspot.com/api/";

    /**
     * The default encoded service path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.7
     */
    public static final String DEFAULT_SERVICE_PATH = "publisher/v1/owners/";

    /**
     * The default encoded batch path of the service. This is determined when the library is
     * generated and normally should not be changed.
     *
     * @since 1.23
     */
    public static final String DEFAULT_BATCH_PATH = "batch";

    /**
     * The default encoded base URL of the service. This is determined when the library is generated
     * and normally should not be changed.
     */
    public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

    // Note: Leave this static initializer at the top of the file.
    static
    {
        com.google.api.client.util.Preconditions.checkState(
                com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
                "You are currently running with version %s of google-api-client. " +
                        "You need at least version 1.15 of google-api-client to run version " +
                        "1.25.0 of the TurnOnline.biz Publisher & Content Engine library.", com.google.api.client.googleapis.GoogleUtils.VERSION );
    }

    /**
     * Constructor.
     *
     * <p>
     * Use {@link Builder} if you need to specify any of the optional parameters.
     * </p>
     *
     * @param transport              HTTP transport, which should normally be:
     *                               <ul>
     *                               <li>Google App Engine:
     *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *                               <li>Android: {@code newCompatibleTransport} from
     *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *                               </li>
     *                               </ul>
     * @param jsonFactory            JSON factory, which may be:
     *                               <ul>
     *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *                               <li>Android Honeycomb or higher:
     *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *                               </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public PublisherEngine( com.google.api.client.http.HttpTransport transport,
                            com.google.api.client.json.JsonFactory jsonFactory,
                            com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
    {
        this( new Builder( transport, jsonFactory, httpRequestInitializer ) );
    }

    /**
     * @param builder builder
     */
    PublisherEngine( Builder builder )
    {
        super( builder );
    }

    @Override
    protected void initialize( com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest )
            throws java.io.IOException
    {
        super.initialize( httpClientRequest );
    }

    /**
     * An accessor for creating requests from the Invoice collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code PublisherEngine publisher = new PublisherEngine(...);}
     *   {@code PublisherEngine.Invoice.List request = publisher.invoice().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Invoice invoice()
    {
        return new Invoice();
    }

    /**
     * An accessor for creating requests from the Owner collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code PublisherEngine publisher = new PublisherEngine(...);}
     *   {@code PublisherEngine.Owner.List request = publisher.owner().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Owner owner()
    {
        return new Owner();
    }

    /**
     * An accessor for creating requests from the Product collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code PublisherEngine publisher = new PublisherEngine(...);}
     *   {@code PublisherEngine.Product.List request = publisher.product().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Product product()
    {
        return new Product();
    }

    /**
     * Builder for {@link PublisherEngine}.
     *
     * <p>
     * Implementation is not thread-safe.
     * </p>
     *
     * @since 1.3.0
     */
    public static final class Builder
            extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder
    {

        /**
         * Returns an instance of a new builder.
         *
         * @param transport              HTTP transport, which should normally be:
         *                               <ul>
         *                               <li>Google App Engine:
         *                               {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
         *                               <li>Android: {@code newCompatibleTransport} from
         *                               {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
         *                               <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
         *                               </li>
         *                               </ul>
         * @param jsonFactory            JSON factory, which may be:
         *                               <ul>
         *                               <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
         *                               <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
         *                               <li>Android Honeycomb or higher:
         *                               {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
         *                               </ul>
         * @param httpRequestInitializer HTTP request initializer or {@code null} for none
         * @since 1.7
         */
        public Builder( com.google.api.client.http.HttpTransport transport,
                        com.google.api.client.json.JsonFactory jsonFactory,
                        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            super(
                    transport,
                    jsonFactory,
                    DEFAULT_ROOT_URL,
                    DEFAULT_SERVICE_PATH,
                    httpRequestInitializer,
                    false );
            setBatchPath( DEFAULT_BATCH_PATH );
        }

        /**
         * Builds a new instance of {@link PublisherEngine}.
         */
        @Override
        public PublisherEngine build()
        {
            return new PublisherEngine( this );
        }

        @Override
        public Builder setRootUrl( String rootUrl )
        {
            return ( Builder ) super.setRootUrl( rootUrl );
        }

        @Override
        public Builder setServicePath( String servicePath )
        {
            return ( Builder ) super.setServicePath( servicePath );
        }

        @Override
        public Builder setBatchPath( String batchPath )
        {
            return ( Builder ) super.setBatchPath( batchPath );
        }

        @Override
        public Builder setHttpRequestInitializer( com.google.api.client.http.HttpRequestInitializer httpRequestInitializer )
        {
            return ( Builder ) super.setHttpRequestInitializer( httpRequestInitializer );
        }

        @Override
        public Builder setApplicationName( String applicationName )
        {
            return ( Builder ) super.setApplicationName( applicationName );
        }

        @Override
        public Builder setSuppressPatternChecks( boolean suppressPatternChecks )
        {
            return ( Builder ) super.setSuppressPatternChecks( suppressPatternChecks );
        }

        @Override
        public Builder setSuppressRequiredParameterChecks( boolean suppressRequiredParameterChecks )
        {
            return ( Builder ) super.setSuppressRequiredParameterChecks( suppressRequiredParameterChecks );
        }

        @Override
        public Builder setSuppressAllChecks( boolean suppressAllChecks )
        {
            return ( Builder ) super.setSuppressAllChecks( suppressAllChecks );
        }

        /**
         * Set the {@link PublisherEngineRequestInitializer}.
         *
         * @since 1.12
         */
        public Builder setPublisherEngineRequestInitializer(
                PublisherEngineRequestInitializer publisherengineRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( publisherengineRequestInitializer );
        }

        @Override
        public Builder setGoogleClientRequestInitializer(
                com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer )
        {
            return ( Builder ) super.setGoogleClientRequestInitializer( googleClientRequestInitializer );
        }
    }

    /**
     * The "invoice" collection of methods.
     */
    public class Invoice
    {

        /**
         * Create a request for the method "invoice.delete".
         * <p>
         * This request holds the parameters needed by the publisher server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param loginId
         * @param name
         * @return the request
         */
        public Delete delete( java.lang.Long loginId, java.lang.String name ) throws java.io.IOException
        {
            Delete result = new Delete( loginId, name );
            initialize( result );
            return result;
        }

        public class Delete
                extends PublisherEngineRequest<Void>
        {

            private static final String REST_PATH = "{login_id}/invoices/{name}";

            @com.google.api.client.util.Key( "login_id" )
            private java.lang.Long loginId;

            @com.google.api.client.util.Key
            private java.lang.String name;

            /**
             * Create a request for the method "invoice.delete".
             * <p>
             * This request holds the parameters needed by the the publisher server.  After setting any
             * optional parameters, call the {@link Delete#execute()} method to invoke the remote operation.
             * <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param loginId
             * @param name
             * @since 1.13
             */
            protected Delete( java.lang.Long loginId, java.lang.String name )
            {
                super( PublisherEngine.this, "DELETE", REST_PATH, null, Void.class );
                this.loginId = com.google.api.client.util.Preconditions.checkNotNull( loginId, "Required parameter loginId must be specified." );
                this.name = com.google.api.client.util.Preconditions.checkNotNull( name, "Required parameter name must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getLoginId()
            {
                return loginId;
            }

            public Delete setLoginId( java.lang.Long loginId )
            {
                this.loginId = loginId;
                return this;
            }

            /**
             *
             */
            public java.lang.String getName()
            {
                return name;
            }

            public Delete setName( java.lang.String name )
            {
                this.name = name;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "owner" collection of methods.
     */
    public class Owner
    {

        /**
         * Create a request for the method "owner.email".
         * <p>
         * This request holds the parameters needed by the publisher server.  After setting any optional
         * parameters, call the {@link Email#execute()} method to invoke the remote operation.
         *
         * @param loginId
         * @param name
         * @param content the {@link biz.turnonline.ecosystem.publisher.model.EmailPayload}
         * @return the request
         */
        public Email email( java.lang.Long loginId,
                            java.lang.String name,
                            biz.turnonline.ecosystem.publisher.model.EmailPayload content ) throws java.io.IOException
        {
            Email result = new Email( loginId, name, content );
            initialize( result );
            return result;
        }

        public class Email
                extends PublisherEngineRequest<biz.turnonline.ecosystem.publisher.model.EmailId>
        {

            private static final String REST_PATH = "{login_id}/templates/{name}/mails";

            @com.google.api.client.util.Key( "login_id" )
            private java.lang.Long loginId;

            @com.google.api.client.util.Key
            private java.lang.String name;

            @com.google.api.client.util.Key( "order_id" )
            private java.lang.Long orderId;

            @com.google.api.client.util.Key( "invoice_id" )
            private java.lang.Long invoiceId;

            /**
             * Create a request for the method "owner.email".
             * <p>
             * This request holds the parameters needed by the the publisher server.  After setting any
             * optional parameters, call the {@link Email#execute()} method to invoke the remote operation.
             * <p> {@link
             * Email#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param loginId
             * @param name
             * @param content the {@link biz.turnonline.ecosystem.publisher.model.EmailPayload}
             * @since 1.13
             */
            protected Email( java.lang.Long loginId,
                             java.lang.String name,
                             biz.turnonline.ecosystem.publisher.model.EmailPayload content )
            {
                super( PublisherEngine.this, "POST", REST_PATH, content, biz.turnonline.ecosystem.publisher.model.EmailId.class );
                this.loginId = com.google.api.client.util.Preconditions.checkNotNull( loginId, "Required parameter loginId must be specified." );
                this.name = com.google.api.client.util.Preconditions.checkNotNull( name, "Required parameter name must be specified." );
            }

            @Override
            public Email setAlt( java.lang.String alt )
            {
                return ( Email ) super.setAlt( alt );
            }

            @Override
            public Email setFields( java.lang.String fields )
            {
                return ( Email ) super.setFields( fields );
            }

            @Override
            public Email setKey( java.lang.String key )
            {
                return ( Email ) super.setKey( key );
            }

            @Override
            public Email setOauthToken( java.lang.String oauthToken )
            {
                return ( Email ) super.setOauthToken( oauthToken );
            }

            @Override
            public Email setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Email ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Email setQuotaUser( java.lang.String quotaUser )
            {
                return ( Email ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Email setUserIp( java.lang.String userIp )
            {
                return ( Email ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getLoginId()
            {
                return loginId;
            }

            public Email setLoginId( java.lang.Long loginId )
            {
                this.loginId = loginId;
                return this;
            }

            /**
             *
             */
            public java.lang.String getName()
            {
                return name;
            }

            public Email setName( java.lang.String name )
            {
                this.name = name;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getOrderId()
            {
                return orderId;
            }

            public Email setOrderId( java.lang.Long orderId )
            {
                this.orderId = orderId;
                return this;
            }

            /**
             *
             */
            public java.lang.Long getInvoiceId()
            {
                return invoiceId;
            }

            public Email setInvoiceId( java.lang.Long invoiceId )
            {
                this.invoiceId = invoiceId;
                return this;
            }

            @Override
            public Email set( String parameterName, Object value )
            {
                return ( Email ) super.set( parameterName, value );
            }
        }

    }

    /**
     * The "product" collection of methods.
     */
    public class Product
    {

        /**
         * Create a request for the method "product.delete".
         * <p>
         * This request holds the parameters needed by the publisher server.  After setting any optional
         * parameters, call the {@link Delete#execute()} method to invoke the remote operation.
         *
         * @param loginId
         * @param name
         * @return the request
         */
        public Delete delete( java.lang.Long loginId, java.lang.String name ) throws java.io.IOException
        {
            Delete result = new Delete( loginId, name );
            initialize( result );
            return result;
        }

        public class Delete
                extends PublisherEngineRequest<Void>
        {

            private static final String REST_PATH = "{login_id}/products/{name}";

            @com.google.api.client.util.Key( "login_id" )
            private java.lang.Long loginId;

            @com.google.api.client.util.Key
            private java.lang.String name;

            /**
             * Create a request for the method "product.delete".
             * <p>
             * This request holds the parameters needed by the the publisher server.  After setting any
             * optional parameters, call the {@link Delete#execute()} method to invoke the remote operation.
             * <p> {@link
             * Delete#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
             * be called to initialize this instance immediately after invoking the constructor. </p>
             *
             * @param loginId
             * @param name
             * @since 1.13
             */
            protected Delete( java.lang.Long loginId, java.lang.String name )
            {
                super( PublisherEngine.this, "DELETE", REST_PATH, null, Void.class );
                this.loginId = com.google.api.client.util.Preconditions.checkNotNull( loginId, "Required parameter loginId must be specified." );
                this.name = com.google.api.client.util.Preconditions.checkNotNull( name, "Required parameter name must be specified." );
            }

            @Override
            public Delete setAlt( java.lang.String alt )
            {
                return ( Delete ) super.setAlt( alt );
            }

            @Override
            public Delete setFields( java.lang.String fields )
            {
                return ( Delete ) super.setFields( fields );
            }

            @Override
            public Delete setKey( java.lang.String key )
            {
                return ( Delete ) super.setKey( key );
            }

            @Override
            public Delete setOauthToken( java.lang.String oauthToken )
            {
                return ( Delete ) super.setOauthToken( oauthToken );
            }

            @Override
            public Delete setPrettyPrint( java.lang.Boolean prettyPrint )
            {
                return ( Delete ) super.setPrettyPrint( prettyPrint );
            }

            @Override
            public Delete setQuotaUser( java.lang.String quotaUser )
            {
                return ( Delete ) super.setQuotaUser( quotaUser );
            }

            @Override
            public Delete setUserIp( java.lang.String userIp )
            {
                return ( Delete ) super.setUserIp( userIp );
            }

            /**
             *
             */
            public java.lang.Long getLoginId()
            {
                return loginId;
            }

            public Delete setLoginId( java.lang.Long loginId )
            {
                this.loginId = loginId;
                return this;
            }

            /**
             *
             */
            public java.lang.String getName()
            {
                return name;
            }

            public Delete setName( java.lang.String name )
            {
                this.name = name;
                return this;
            }

            @Override
            public Delete set( String parameterName, Object value )
            {
                return ( Delete ) super.set( parameterName, value );
            }
        }

    }
}