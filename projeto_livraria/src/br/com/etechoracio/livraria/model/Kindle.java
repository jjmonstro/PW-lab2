package br.com.etechoracio.livraria.model;

public class Kindle extends Livro implements Oferta{
    private String marcaDAgua;

    @Override
    protected void detalhar() {
        System.out.println("Marca D'agua " + marcaDAgua);
    }

    @Override
    public double calcularDesc(double percentual) {
        if (percentual >0.2) {
            System.out.println("não deve ser maior que 20%");
        } else {
            valor = valor-valor*percentual;
        }
        return valor;
    }

    @Override
    public double valor() {
        return valor;
    }


    public void aplicarDesconto(Desconto desconto) {
        this.valor=desconto.aplicar(this.valor);
    }
}
