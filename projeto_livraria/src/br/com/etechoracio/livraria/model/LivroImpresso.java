package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;

public class LivroImpresso extends Livro implements Oferta{
    private TipoCapaEnum tipoCapa;

    void cobrarCapa(){
        if (tipoCapa== TipoCapaEnum.DURA){
            valor=valor+5;
        } else if (tipoCapa== TipoCapaEnum.PERONALIZADA) {
            valor=valor+10;
        }
    }

    double getTaxaEnvio(){

        return calcularDesc(0.10) * 0.05;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }

    public LivroImpresso() {
        tipoCapa = TipoCapaEnum.COMUM;
        cobrarCapa();
    }

    @Override
    protected void detalhar(){
        System.out.println("Tipo de capa " + tipoCapa);
        System.out.println("Taxa Envio " + formatarValor(getTaxaEnvio()));
    }

    @Override
    public double valor() {
        return 0;
    }

    public void aplicarDesconto(Desconto desconto){
    }
}
