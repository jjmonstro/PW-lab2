package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.exception.ValorDescontoException;
import br.com.etechoracio.livraria.exception.ValorNegativoException;

import java.security.InvalidParameterException;

public class DescontoFixo implements Desconto {
    private double valor;

    public double aplicar(double preco)  {
        if(valor > preco){
            throw new ValorDescontoException("Valor de desconto exedido");
           // throw new IllegalArgumentException("Valor de desconto exedido");
        }
        if(valor < 0){
            throw new ValorNegativoException("Valor de desconto exedido");
            //throw new InvalidParameterException("Valor de desconto negativo n da bb");
        }

        return preco - this.valor;
    };

    public DescontoFixo(double valor) {
        this.valor = valor;
    }
}
