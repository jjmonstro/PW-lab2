package br.com.etechoracio.bancoimobiliario.test;

import br.com.etechoracio.bancoimobiliario.model.Jogador;

import java.util.ArrayList;
import java.util.List;

public class TesteJogo {
    public static void main(String[] args) {
        //Jogada 1
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Rogerio", 10000));
        jogadores.add(new Jogador("Marion", 10000));
        jogadores.add(new Jogador("Edson", 10000));
        String sigla = "M";
        String operacao = "C";
        double valor = 5000;
        Jogador jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(sigla))
                .findFirst().orElseThrow();
        jogador.jogar(operacao, valor);

        //Jogada 2
        operacao = "C";
        valor = 3000;
        String finalSigla = "E";
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla))
                .findFirst().orElseThrow();
        jogador.jogar(operacao, valor);

        //Jogada 3
        operacao = "A";
        valor = 1000;
        String finalSigla1 = "M";
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla1))
                .findFirst().orElseThrow();
        jogador.jogar(operacao, valor);

        //Jogada 4
        operacao = "V";
        valor = 4000;
        String finalSigla2 = "E";
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla2))
                .findFirst().orElseThrow();
        jogador.jogar(operacao, valor);

        //Jogada 5
        operacao = "A";
        valor = 1000;
        String finalSigla3 = "R";
        jogador = jogadores.stream()
                .filter(e -> e.getNome().startsWith(finalSigla3))
                .findFirst().orElseThrow();
        jogador.jogar(operacao, valor);


    }
}
