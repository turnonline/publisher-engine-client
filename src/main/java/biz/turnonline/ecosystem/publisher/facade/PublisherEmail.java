package biz.turnonline.ecosystem.publisher.facade;

import biz.turnonline.ecosystem.publisher.model.EmailFrom;
import biz.turnonline.ecosystem.publisher.model.EmailPayload;
import biz.turnonline.ecosystem.publisher.model.EmailPayloadContent;
import biz.turnonline.ecosystem.publisher.model.EmailRecipient;
import biz.turnonline.ecosystem.publisher.model.EmailRecipients;
import biz.turnonline.ecosystem.publisher.model.EmailReplyTo;
import com.google.common.base.Splitter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The {@link EmailPayload} builder.
 * Always used {@link StandardCharsets#UTF_8} as body charset.
 *
 * @author <a href="mailto:medvegy@turnonline.biz">Aurel Medvegy</a>
 */
public class PublisherEmail
{
    private EmailPayload payload;

    public PublisherEmail()
    {
        payload = new EmailPayload();
    }

    /**
     * Sets the email subject.
     * If not set, the subject will be populated based on the pattern of the specified template.
     *
     * @param subject the subject to be set
     * @return this to chain calls
     */
    public PublisherEmail subject( @Nullable String subject )
    {
        payload.setSubject( subject );
        return this;
    }

    /**
     * Sets the email message body.
     * If not set, the message body will be populated based on the specified template.
     *
     * @param body the email body to be set
     * @return this to chain calls
     */
    public PublisherEmail body( @Nonnull String body )
    {
        checkNotNull( body );

        EmailPayloadContent content = payload.getContent();
        if ( content == null )
        {
            content = new EmailPayloadContent();
            payload.setContent( content );
        }
        content.setBody( body );
        return this;
    }

    /**
     * Sets the email content type.
     * If not set, the content type will be populated based on the specified template.
     *
     * @param type the content type to be set
     * @return this to chain calls
     */
    public PublisherEmail contentType( @Nonnull ContentType type )
    {
        checkNotNull( type );

        EmailPayloadContent content = payload.getContent();
        if ( content == null )
        {
            content = new EmailPayloadContent();
            payload.setContent( content );
        }
        content.setType( type.getType() );
        return this;
    }

    /**
     * Sets email sender description.
     * If not set, the content type will be populated based on the specified template.
     *
     * @param email the email address of the sender
     * @param name  the name of the person who is sending the email message
     * @return this to chain calls
     */
    public PublisherEmail from( @Nonnull String email, @Nullable String name )
    {
        checkNotNull( email );

        EmailFrom from = payload.getFrom();
        if ( from == null )
        {
            from = new EmailFrom();
            payload.setFrom( from );
        }
        from.setEmail( email );
        from.setName( name );

        return this;
    }

    /**
     * Sets the property to indicate an email address other than the ‘from’ address to use to reply to the message.
     * If not set, the 'reply to' will be populated based on the specified template.
     *
     * @param email the email address
     * @param name  the name of the person
     * @return this to chain calls
     */
    public PublisherEmail replyTo( @Nonnull String email, @Nullable String name )
    {
        checkNotNull( email );

        EmailReplyTo replyTo = payload.getReplyTo();
        if ( replyTo == null )
        {
            replyTo = new EmailReplyTo();
            payload.setReplyTo( replyTo );
        }
        replyTo.setEmail( email );
        replyTo.setName( name );

        return this;
    }

    /**
     * Adds recipient to whom you are sending an email.
     * If not set, the 'TO' will be populated based on the specified template.
     *
     * @param email the email address
     * @param name  the name of the person
     * @return this to chain calls
     */
    public PublisherEmail addTo( @Nonnull String email, @Nullable String name )
    {
        checkNotNull( email );

        EmailRecipients recipients = payload.getRecipients();
        if ( recipients == null )
        {
            recipients = new EmailRecipients();
            payload.setRecipients( recipients );
        }

        List<EmailRecipient> to = recipients.getTo();
        if ( to == null )
        {
            to = new ArrayList<>();
            recipients.setTo( to );
        }

        EmailRecipient recipient = new EmailRecipient();
        to.add( recipient );

        recipient.setEmail( email );
        recipient.setName( name );

        return this;
    }

    /**
     * Adds the list of comma separated email address.
     *
     * @param emailAddress the list of comma separated email address
     * @return this to chain calls
     */
    public PublisherEmail addTo( @Nonnull String emailAddress )
    {
        checkNotNull( emailAddress );

        if ( emailAddress.contains( "," ) )
        {
            List<String> emails = Splitter
                    .on( "," )
                    .omitEmptyStrings()
                    .trimResults()
                    .splitToList( emailAddress );

            for ( String email : emails )
            {
                addTo( email, null );
            }
        }
        else
        {
            addTo( emailAddress, null );
        }

        return this;
    }

    /**
     * Adds recipient who will get copy of the email message.
     * If not set, the 'CC' will be populated based on the specified template.
     *
     * @param email the email address
     * @param name  the name of the person
     * @return this to chain calls
     */
    public PublisherEmail addCc( @Nonnull String email, @Nullable String name )
    {
        checkNotNull( email );

        EmailRecipients recipients = payload.getRecipients();
        if ( recipients == null )
        {
            recipients = new EmailRecipients();
            payload.setRecipients( recipients );
        }

        List<EmailRecipient> copy = recipients.getCc();
        if ( copy == null )
        {
            copy = new ArrayList<>();
            recipients.setCc( copy );
        }

        EmailRecipient recipient = new EmailRecipient();
        copy.add( recipient );

        recipient.setEmail( email );
        recipient.setName( name );

        return this;
    }

    /**
     * Adds the list of comma separated email address.
     *
     * @param emailAddress the list of comma separated email address
     * @return this to chain calls
     */
    public PublisherEmail addCc( @Nonnull String emailAddress )
    {
        checkNotNull( emailAddress );

        if ( emailAddress.contains( "," ) )
        {
            List<String> emails = Splitter
                    .on( "," )
                    .omitEmptyStrings()
                    .trimResults()
                    .splitToList( emailAddress );

            for ( String email : emails )
            {
                addCc( email, null );
            }
        }
        else
        {
            addCc( emailAddress, null );
        }

        return this;
    }

    /**
     * Adds recipient who will get blind copy of the email message.
     * If not set, the 'BCC' will be populated based on the specified template.
     *
     * @param email the email address
     * @param name  the name of the person
     * @return this to chain calls
     */
    public PublisherEmail addBcc( @Nonnull String email, @Nullable String name )
    {
        checkNotNull( email );

        EmailRecipients recipients = payload.getRecipients();
        if ( recipients == null )
        {
            recipients = new EmailRecipients();
            payload.setRecipients( recipients );
        }

        List<EmailRecipient> blind = recipients.getBcc();
        if ( blind == null )
        {
            blind = new ArrayList<>();
            recipients.setBcc( blind );
        }

        EmailRecipient recipient = new EmailRecipient();
        blind.add( recipient );

        recipient.setEmail( email );
        recipient.setName( name );

        return this;
    }

    /**
     * Adds the list of comma separated email address.
     *
     * @param emailAddress the list of comma separated email address
     * @return this to chain calls
     */
    public PublisherEmail addBcc( @Nonnull String emailAddress )
    {
        checkNotNull( emailAddress );

        if ( emailAddress.contains( "," ) )
        {
            List<String> emails = Splitter
                    .on( "," )
                    .omitEmptyStrings()
                    .trimResults()
                    .splitToList( emailAddress );

            for ( String email : emails )
            {
                addBcc( email, null );
            }
        }
        else
        {
            addBcc( emailAddress, null );
        }

        return this;
    }

    /**
     * Builds and returns populated instance of the {@link EmailPayload}.
     *
     * @return the email payload to be consumed by the PublisherEmail API endpoint as a body
     */
    public EmailPayload build()
    {
        return payload;
    }

    public enum ContentType
    {
        TEXT_PLAIN( "text/plain" ),
        TEXT_HTML( "text/html" );

        private String type;

        ContentType( String type )
        {
            this.type = type;
        }

        public String getType()
        {
            return type;
        }
    }

    /**
     * The list of supported email templates.
     */
    public enum Template
    {
        ACCOUNT_REGISTRATION,
        EVENT,
        ISSUED_INVOICE,
        ISSUED_PROFORMA_INVOICE
    }
}
