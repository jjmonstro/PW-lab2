public class TestaReferencia {

    public static void main(String[] args) {

        Livro livroA = new Livro();
        livroA.setTitulo("Teste Referência");
        System.out.println("Livro A:" + livroA.getTitulo());

        Livro livroB = livroA;
        System.out.println("Livro B:" + livroB.getTitulo());

        livroB.setTitulo("Teste de Referencia II");
        System.out.println("Livro B:" + livroB.getTitulo());

        System.out.println("Livro A:" + livroA.getTitulo());

        System.out.println(livroA);

        System.out.println(livroB);
    }
}
