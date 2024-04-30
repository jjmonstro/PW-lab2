package models;
// MATHEUS BERNARDINO, JOAO PEDRO CORREIA
public class Diaria extends Despesa{
    private double qtdDiaria;

    public double getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    @Override
    public void cadastrarDespesa(String nomeRestaurante, int qtdRefeicao) {

    }

    @Override
    public void cadastrarDespesa(double kmPercorrida, double valorPedagios) {

    }


    @Override
    public void cadastrarDespesa(double qtdDiaria) {
        this.qtdDiaria=qtdDiaria;
    }

    @Override
    public double calcularDespesa(){
        double valorDiaria = this.qtdDiaria * 50;
        return valorDiaria;
    }

    @Override
    public String listarDespesa(){
        double tudo = this.qtdDiaria;
        String tudoString = Double.toString(tudo);
        return tudoString;
    }
}
