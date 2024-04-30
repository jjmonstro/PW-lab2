package models;
// MATHEUS BERNARDINO, JOAO PEDRO CORREIA
public class Transporte extends Despesa{
    private double kmPercorrida;
    private double valorPedagios;

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }

    @Override
    public void cadastrarDespesa(double kmPercorrida, double valorPedagios){
        this.kmPercorrida = kmPercorrida;
        this.valorPedagios = valorPedagios;
    }

    @Override
    public void cadastrarDespesa(double qtdDiaria) {

    }

    @Override
    public double calcularDespesa() {
        double valorTransp = (kmPercorrida * 3) + valorPedagios;
        return valorTransp;
    }

    @Override
    public String listarDespesa(){
        double tudo = this.kmPercorrida + this.valorPedagios;
        String tudoString = Double.toString(tudo);
        return tudoString;
    }

    @Override
    public void cadastrarDespesa(String nomeRestaurante, int qtdRefeicao) {

    }
}
