package exAula192.model.entidades;

public class Fatura {
    private Double pagamentoBasico;
    private Double imposto;

    public Fatura(){

    }

    public Fatura(Double pagamentoBasico, Double imposto) {
        this.pagamentoBasico = pagamentoBasico;
        this.imposto = imposto;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double PagamentoTotal(){
        return getPagamentoBasico() + getImposto();
    }

}
