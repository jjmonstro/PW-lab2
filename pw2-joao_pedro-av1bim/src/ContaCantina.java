//João Pedro Correia, prova A
//Não fez o construtor
public class ContaCantina {
    private TipoContaEnum tipoConta;
    private double saldo;
    private double limite;
    private double saldoMinimo;


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
        emitirAlertaSaldoBaixo();
    }

    public void setTipoConta(TipoContaEnum tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public TipoContaEnum getTipoConta() {
        return tipoConta;
    }

    public void setSaldoContaMinimo(double saldo) {
        this.saldo = saldo;
        this.tipoConta = TipoContaEnum.ALUNO;
        this.saldoMinimo = 10;
    }

    public void setTipoContaSaldo(TipoContaEnum tipoConta, double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;

        if (tipoConta == TipoContaEnum.PROFESSOR){
            this.saldo = this.saldo + 100;
        }
    }
//Não fez o else
    public void emitirAlertaSaldoBaixo() {
        if (this.saldo < this.saldoMinimo) {
            System.out.println("ALERTA DE SALDO BAIXO: R$ " + this.saldo);
        }
    }

    public void debitar(double debito){
        if (this.tipoConta==TipoContaEnum.DIRETOR){
            this.saldo = this.saldo-debito;
            emitirAlertaSaldoBaixo();
        } else if (this.saldo>debito && this.tipoConta==TipoContaEnum.PROFESSOR && debito<this.saldo+this.limite) {
            this.saldo = this.saldo-debito;
            emitirAlertaSaldoBaixo();
        }else {
            System.out.println("Conta sem saldo suficiente");
        }
    }

    //Está somando duas vezes caso seja aluno

    public void creditar(double valor) {
        this.saldo = this.saldo+valor;
        if (this.tipoConta==TipoContaEnum.ALUNO && valor>100){
            this.saldo = this.saldo+5;
        }
    }

}



