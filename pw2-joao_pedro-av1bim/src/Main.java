//João Pedro Correia, prova A
public class Main {
    public static void main(String[] args){
        ContaCantina conta1 = new ContaCantina();
        conta1.setTipoConta(TipoContaEnum.PROFESSOR);
        conta1.setLimite(100.00);
        conta1.setSaldo(100.00);
        conta1.setSaldoMinimo(15.00);

        conta1.creditar(50);

        System.out.println(conta1.getSaldo()+"\n");

        conta1.debitar(500);
        System.out.println(conta1.getSaldo()+"\n");

        conta1.setTipoConta(TipoContaEnum.ALUNO);
        conta1.creditar(110);
        System.out.println(conta1.getSaldo()+"\n");

        conta1.setSaldoMinimo(1500.00);
    }
}