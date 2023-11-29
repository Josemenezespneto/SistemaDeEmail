package com.sistemaDeEmail.sistemaDeEmail.application;

import com.sistemaDeEmail.sistemaDeEmail.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;
    @Autowired
    public EmailSenderService (EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}