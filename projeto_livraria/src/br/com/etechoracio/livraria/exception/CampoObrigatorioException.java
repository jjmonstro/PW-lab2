package br.com.etechoracio.livraria.exception;

public class CampoObrigatorioException extends RuntimeException{
    public CampoObrigatorioException(String message) {
        super(message);
    }
}
