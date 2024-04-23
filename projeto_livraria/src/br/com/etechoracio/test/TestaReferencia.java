package br.com.etechoracio.test;

import br.com.etechoracio.livraria.model.Livro;
import br.com.etechoracio.livraria.model.LivroImpresso;

public class TestaReferencia {

    public static void main(String[] args) {

        LivroImpresso livroA = new LivroImpresso();
        livroA.setTitulo("Teste Referência");
        System.out.println("br.com.etechoracio.livraria.model.Livro A:" + livroA.getTitulo());

        Livro livroB = livroA;
        System.out.println("br.com.etechoracio.livraria.model.Livro B:" + livroB.getTitulo());

        livroB.setTitulo("Teste de Referencia II");
        System.out.println("br.com.etechoracio.livraria.model.Livro B:" + livroB.getTitulo());

        System.out.println("br.com.etechoracio.livraria.model.Livro A:" + livroA.getTitulo());

        System.out.println(livroA);

        System.out.println(livroB);
    }
}
