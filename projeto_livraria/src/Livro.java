import javax.sound.midi.Soundbank;

public class Livro {
    private double valor;
    private String titulo;
    private String resumo;
    private String autor;
    private Editora editora;
    private TipoCapaEnum tipoCapa;
    int paginas;
    void exibir(){
        System.out.println("\nDetalhes do Livro");
        System.out.println("Titulo " + titulo);
        System.out.println("Resumo " + resumo);
        System.out.println("Valor (Com desconto) " + formatarValor(calcularDesc(0.10)));
        System.out.println("Autor " + autor);
        System.out.println("Tipo de Capa " + tipoCapa);
        System.out.println("Quantidade de paginas " + paginas);
        editora.exibir();
        System.out.println("Taxa de Envio (com base no valor o desconto): " + formatarValor(getTaxaEnvio()));
    }    double calcularDesc(double param){
        return valor - (valor * param);
    }

    void cobrarCapa(){
        if (tipoCapa==TipoCapaEnum.DURA){
            valor=valor+5;
        } else if (tipoCapa==TipoCapaEnum.PERONALIZADA) {
            valor=valor+10;
        }
    }

    double getTaxaEnvio(){
        return calcularDesc(0.10) * 0.05;
    }

    String formatarValor(double param){
        return String.format("R$ %.2f", param);
    }

    double calcularDesc(){
        return valor * 0.15;
    }


    public Livro() {
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo.toUpperCase();
    }
}
