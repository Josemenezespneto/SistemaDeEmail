package com.sistemaDeEmail.sistemaDeEmail.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
