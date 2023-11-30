package com.sistemaDeEmail.sistemaDeEmail.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.sistemaDeEmail.sistemaDeEmail.adapters.EmailSenderGateway;
import com.sistemaDeEmail.sistemaDeEmail.core.excepitions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void senderEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("menezespn@gmail.com")
                .withDestination(new Destination().withToAddresses("to"))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );
        try{
            this.amazonSimpleEmailService.sendEmail(request);

        }catch (AmazonServiceException exception) {
            throw new EmailServiceException("Failure while sending e-mail", exception);
        }

    }
}
