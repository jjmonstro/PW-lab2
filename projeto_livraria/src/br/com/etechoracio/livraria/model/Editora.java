package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.exception.NomeEditoraException;

public class Editora {
    public String nome;

    public void setNome(String nome) {
        if(nome.length()>4){
            throw new NomeEditoraException("Nome Incorreto");
        }
        this.nome = nome;
    }

    public String site;
    void exibir(){
        System.out.println("\nDetalhes da br.com.etechoracio.livraria.model.Editora");
        System.out.println("Nome " + nome);
        System.out.println("Site " + site);
    }
}
