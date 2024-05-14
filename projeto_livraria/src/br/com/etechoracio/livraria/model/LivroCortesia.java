package br.com.etechoracio.livraria.model;

public class LivroCortesia extends Livro{
    private String marcaDAgua;

    public void detalhar(){
        System.out.println(this.marcaDAgua);
    }

    public void SetValor(double valor){

    }

    public double valor() {
        return 0;
    }

    public LivroCortesia(String marcaDAgua) {
        this.marcaDAgua = marcaDAgua;
    }


}
