package models;
// MATHEUS BERNARDINO, JOAO PEDRO CORREIA
public abstract class  Despesa {
    private String descricao;
    private double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastrarDespesa(String descricao){
        this.descricao = descricao;
        valorTotal = 0;
    }

    public abstract double calcularDespesa();

    public abstract String listarDespesa();


    public abstract void cadastrarDespesa(String nomeRestaurante, int qtdRefeicao);

    public abstract void cadastrarDespesa(double kmPercorrida, double valorPedagios);


    public abstract void cadastrarDespesa(double qtdDiaria);
}
