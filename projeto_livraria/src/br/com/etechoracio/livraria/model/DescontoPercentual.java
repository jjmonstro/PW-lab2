package br.com.etechoracio.livraria.model;

public class DescontoPercentual implements Desconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double aplicar(double preco){
        return preco - (preco * this.percentual);
    };
}
