package br.com.etechoracio.livraria.model;

public class Kindle extends Livro {
    private String marcaDAgua;

    @Override
    public double calcularDesc(double percentual) {
        if (percentual >0.2) {
            System.out.println("não deve ser maior que 20%");
        } else {
            valor = valor-valor*percentual;
        }
        return valor;
    }
}
