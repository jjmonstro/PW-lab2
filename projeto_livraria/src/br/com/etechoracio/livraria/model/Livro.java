package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.exception.CampoObrigatorioException;

public abstract class Livro implements Exemplar {
    protected double valor;
    private String titulo;
    private String resumo;
    private String autor;
    private Editora editora;
    private int paginas;
    protected abstract void detalhar();
    public void exibir(){
        System.out.println("\nDetalhes do br.com.etechoracio.livraria.model.Livro");
        System.out.println("Titulo " + titulo);
        System.out.println("Resumo " + resumo);
        System.out.println("Valor (Com desconto) " + formatarValor(calcularDesc(0.10)));
        System.out.println("Autor " + autor);
        //System.out.println("Tipo de Capa " + tipoCapa);
        System.out.println("Quantidade de paginas " + paginas);
        detalhar();
        editora.exibir();
        //System.out.println("Taxa de Envio (com base no valor o desconto): " + formatarValor(getTaxaEnvio()));
    }
//    double calcularDesc(){
//        return valor - (valor * percentual);
//    }

    public double calcularDesc(double percentual){

        if (percentual >0.2) {
            System.out.println("não deve ser maior que 20%");
        } else {
            valor = valor-valor*percentual;
        }
        return valor;
    }

    String formatarValor(double param){
        return String.format("R$ %.2f", param);
    }

    public void setValor(double valor) {
        if (valor<0){
            throw new CampoObrigatorioException("negativo");
        }
        this.valor = valor;
        //cobrarCapa();
    }

    public void setTitulo(String titulo) {
        if (titulo == null){
            throw new CampoObrigatorioException("campo obrigatorio");
        }
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

    public double getValor() {
        return valor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }


    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
