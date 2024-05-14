package br.com.etechoracio.livraria.model;

public class SacolaCompras {
    private double total;
    public void adicionar(Exemplar item){
        if (item instanceof Oferta) {
            ((Oferta) item).aplicarDesconto(new DescontoFixo(1.25));
        }

        System.out.println("Adicionado " + item);
         total = total + item.getValor();
    }
}
