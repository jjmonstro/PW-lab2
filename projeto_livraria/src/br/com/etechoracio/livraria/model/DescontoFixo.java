package br.com.etechoracio.livraria.model;

import java.security.InvalidParameterException;

public class DescontoFixo implements Desconto {
    private double valor;

    public double aplicar(double preco)  {
        if(valor > preco){
            throw new IllegalArgumentException("Valor de desconto exedido");
        }
        if(valor < 0){
            throw new InvalidParameterException("Valor de desconto negativo n da bb");
        }

        return preco - this.valor;
    };

    public DescontoFixo(double valor) {
        this.valor = valor;
    }
}
