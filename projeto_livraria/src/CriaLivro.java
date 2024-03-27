public class CriaLivro {
    public static void main(String[] args) {
        Editora brocagang = new Editora();
        brocagang.nome = "Brocagang";
        brocagang.site = "brocagang.com.br";

        Editora vemtranquilo = new Editora();
        vemtranquilo.nome = "Vemtranquilo";
        vemtranquilo.site = "vemtranquilo.com.br";

        Livro  primeiroLivro = new Livro(TipoCapaEnum.DURA);
        primeiroLivro.setTitulo("Sabão Macaco");
        primeiroLivro.setEditora(brocagang);
        primeiroLivro.setValor(100);
        primeiroLivro.setTipoCapa(TipoCapaEnum.PERONALIZADA);
        primeiroLivro.calcularDesc();

        primeiroLivro.exibir();


        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("Ipiranga");
        segundoLivro.setAutor("Correx né Vida");
        segundoLivro.setTipoCapa(TipoCapaEnum.PERONALIZADA);
        segundoLivro.setEditora(vemtranquilo);
        segundoLivro.exibir();
    }

}
