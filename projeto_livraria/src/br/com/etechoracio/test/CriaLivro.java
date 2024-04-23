package br.com.etechoracio.test;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.*;

public class CriaLivro {
    public static void main(String[] args) {
        Editora brocagang = new Editora();
        brocagang.nome = "Brocagang";
        brocagang.site = "brocagang.com.br";

        Editora vemtranquilo = new Editora();
        vemtranquilo.nome = "Vemtranquilo";
        vemtranquilo.site = "vemtranquilo.com.br";

        LivroImpresso  primeiroLivro = new LivroImpresso();
        primeiroLivro.setTitulo("Sabão Macaco");
        primeiroLivro.setEditora(brocagang);
        primeiroLivro.setValor(100);
        primeiroLivro.setTipoCapa(TipoCapaEnum.PERONALIZADA);
        primeiroLivro.calcularDesc(0.15);
        primeiroLivro.exibir();


        LivroImpresso segundoLivro = new LivroImpresso();
        segundoLivro.setTitulo("Ipiranga");
        segundoLivro.setAutor("Correx né Vida");
        segundoLivro.setTipoCapa(TipoCapaEnum.PERONALIZADA);
        segundoLivro.setEditora(vemtranquilo);
        segundoLivro.exibir();

        Kindle terceiroLivro = new Kindle();
        terceiroLivro.setTitulo("Tranquilo");
        terceiroLivro.setEditora(brocagang);
        terceiroLivro.setValor(90000);

        SacolaCompras sacola1234 = new SacolaCompras();
        sacola1234.adicionar(primeiroLivro);
        sacola1234.adicionar(segundoLivro);
        sacola1234.adicionar(terceiroLivro);
    }

}
