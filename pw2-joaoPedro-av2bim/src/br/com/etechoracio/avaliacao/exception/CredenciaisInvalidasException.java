package br.com.etechoracio.avaliacao.exception;

public class CredenciaisInvalidasException extends RuntimeException{
    public CredenciaisInvalidasException(String message) {
        super(message);
    }
}
