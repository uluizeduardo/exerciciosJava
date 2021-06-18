package exAula192.model.servicos;

import exAula192.model.entidades.AlugelDeCarro;
import exAula192.model.entidades.Fatura;

public class ServicoDeAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private ServicoFiscalDoBrasil servicoFiscalDoBrasil;

    public ServicoDeAluguel(){

    }

    public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, ServicoFiscalDoBrasil servicoFiscalDoBrasil) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.servicoFiscalDoBrasil = servicoFiscalDoBrasil;
    }

    public Double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public Double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public void processamentoFiscal(AlugelDeCarro aluguelDeCarro){
        long instante1 = aluguelDeCarro.getInicio().getTime(); //Variável para pegar o valor em milesegundos da data inicial
        long instante2 = aluguelDeCarro.getFim().getTime();//Variável para pegar o valor em milesegundos da data final
        double horas = (double)(instante2 - instante1) / 1000 / 60 / 60;//Variável para pegar a diferença em horas

        double pagamentoBasico;
        if (horas < 12.0){
            pagamentoBasico = Math.ceil(horas) * precoPorHora;
        }
        else {
            pagamentoBasico = Math.ceil(horas / 24) * precoPorDia;
        }

        double imposto = servicoFiscalDoBrasil.imposto(pagamentoBasico);

        aluguelDeCarro.setFatura(new Fatura(pagamentoBasico, imposto));
    }
}
