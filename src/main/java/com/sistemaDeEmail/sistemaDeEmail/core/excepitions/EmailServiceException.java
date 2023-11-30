package com.sistemaDeEmail.sistemaDeEmail.core.excepitions;

public class EmailServiceException extends  RuntimeException{
    public EmailServiceException (String menssage){
        super(menssage);
    }

    public EmailServiceException (String message, Throwable cause){
        super(message, cause);
    }
}
