package br.com.etechoracio.livraria.model;

public class SacolaCompras {
    private double total;
    public void adicionar(Exemplar item){
        System.out.println("Adicionado " + item);
         total = total + item.getValor();
    }
}
