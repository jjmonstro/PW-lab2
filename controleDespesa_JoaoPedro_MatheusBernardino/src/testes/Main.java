// MATHEUS BERNARDINO, JOAO PEDRO CORREIA
package testes;

import models.Alimentacao;

public class Main {
    public static void main(String[] args) {
        Alimentacao joao = new Alimentacao();
        joao.setNomeRestaurante("Correia");
        joao.setQtdRefeicao(99);
        joao.setValorTotal(999.6);
        joao.setDescricao("mutio bom");

        joao.cadastrarDespesa("Correia",99);
        System.out.println(joao.listarDespesa());
        System.out.println(joao.calcularDespesa());


    }
}