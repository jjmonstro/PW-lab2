package br.com.etechoracio.test;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.Editora;
import br.com.etechoracio.livraria.model.Kindle;
import br.com.etechoracio.livraria.model.Livro;

public class CriaLivro {
    public static void main(String[] args) {
        Editora brocagang = new Editora();
        brocagang.nome = "Brocagang";
        brocagang.site = "brocagang.com.br";

        Editora vemtranquilo = new Editora();
        vemtranquilo.nome = "Vemtranquilo";
        vemtranquilo.site = "vemtranquilo.com.br";

        Livro  primeiroLivro = new Livro(TipoCapaEnum.DURA);
        primeiroLivro.setTitulo("Sabão Macaco");
        primeiroLivro.setEditora(brocagang);
        primeiroLivro.setValor(100);
        primeiroLivro.setTipoCapa(TipoCapaEnum.PERONALIZADA);
        primeiroLivro.calcularDesc(0.15);
        primeiroLivro.exibir();


        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("Ipiranga");
        segundoLivro.setAutor("Correx né Vida");
        segundoLivro.setTipoCapa(TipoCapaEnum.PERONALIZADA);
        segundoLivro.setEditora(vemtranquilo);
        segundoLivro.exibir();

        Kindle terceiroLivro = new Kindle();
        terceiroLivro.setTitulo("Tranquilo");
        terceiroLivro.setEditora(brocagang);
        terceiroLivro.setValor(90000);
    }

}
