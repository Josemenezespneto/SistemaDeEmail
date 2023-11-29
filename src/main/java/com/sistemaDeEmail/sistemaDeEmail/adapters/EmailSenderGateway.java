package com.sistemaDeEmail.sistemaDeEmail.adapters;

public interface EmailSenderGateway {
    void senderEmail(String to, String subject, String body);
}
