package br.com.etechoracio.livraria.model;

import java.awt.geom.IllegalPathStateException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class SacolaCompras {
    //private double total;
    private List<Exemplar> itens = new ArrayList<>();
    public void adicionar(Exemplar item){

        try {
            if (item instanceof Oferta) {
                ((Oferta) item).aplicarDesconto(new DescontoFixo(1));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Adicionado " + item);
         //total = total + item.getValor();
         itens.add(item);
    }
    public void exibirItens(){
        itens.forEach(i -> System.out.println(i.getValor()));
    }

    public double exibirTotal(){
        return itens.stream().mapToDouble(i-> i.getValor()).sum();
    }
}
