package exAula197.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dataDeVencimento;
    private Double valorDaParcela;

    public Prestacao(){

    }

    public Prestacao(Date dataDeVencimento, Double valor) {
        this.dataDeVencimento = dataDeVencimento;
        this.valorDaParcela = valor;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Double getValorDaParcela() {
        return valorDaParcela;
    }

    public void setValorDaParcela(Double valorDaParcela) {
        this.valorDaParcela = valorDaParcela;
    }

    @Override
    public String toString(){
        return sdf.format(dataDeVencimento) + " - " + String.format("%.2f", valorDaParcela);
    }
}
