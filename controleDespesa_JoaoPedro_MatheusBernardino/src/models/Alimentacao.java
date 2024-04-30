package models;
// MATHEUS BERNARDINO, JOAO PEDRO CORREIA
public class Alimentacao extends Despesa {
    private  String nomeRestaurante;
    private int qtdRefeicao;

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }

    @Override
    public double calcularDespesa() {
        double valor = this.qtdRefeicao * 18;
        return valor;
    }

    @Override
    public void cadastrarDespesa(String nomeRestaurante, int qtdRefeicao){
        this.nomeRestaurante = nomeRestaurante;
        this.qtdRefeicao = qtdRefeicao;
    }


    @Override
    public void cadastrarDespesa(double kmPercorrida, double valorPedagios) {

    }

    @Override
    public void cadastrarDespesa(double qtdDiaria) {

    }

    @Override
    public String listarDespesa(){
        String tudo = this.nomeRestaurante + this.qtdRefeicao;
        return tudo;
    }


}
