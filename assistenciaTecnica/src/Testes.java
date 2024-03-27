public class Testes {
    public static void main(String[] args) {
        Cliente Correx = new Cliente();
        Correx.cpf = 54304508;
        Correx.endereco = "Rua Trajano de Faria - 216";
        Correx.telefone = 11.961261089;

        System.out.println("CLIENTE:\nEndereço: "+Correx.endereco+"\nCPF: "+Correx.cpf+"\nTelefone: "+Correx.telefone);

        Tecnico Humild = new Tecnico();
        Humild.matricula = 666999;
        Humild.nome = "Humild";
        Humild.salario = 50.5;
        Humild.telefone = 11-937076353;

        System.out.println("\nTECNICO:\nNome: "+Humild.nome+"\nSalario: "+Humild.salario);

        Aparelho MotoMoto = new Aparelho();
        MotoMoto.fabricante = "Motorola";
        MotoMoto.idAparelho = 6699;
        MotoMoto.modelo = "MotoG54";
        MotoMoto.tipoDispositivo=TipoDispositivoEnum.SMARTPHONES;

        System.out.println("\nAPARELHO:\nModelo: "+MotoMoto.modelo+"\nFabricante: "+MotoMoto.fabricante);

        OrdemDeServico Ordem1 = new OrdemDeServico();
        Ordem1.aparelho = MotoMoto;
//        Ordem1.dataAtendimento = 23/10/22;
        Ordem1.idOrdem = 66996;
        Ordem1.valor = 9999.99;
        Ordem1.descricaoServico = "O aparelho está completamente destruído, compre outro";

        System.out.println("\nORDEM:\nID: "+Ordem1.idOrdem+"\nValor: "+Ordem1.valor);

    }
}
