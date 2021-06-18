package exAula192.model.servicos;

public class ServicoFiscalDoBrasil implements ServicoDeImposto{

    public double imposto(double quantia){
        if (quantia <= 100.0){
            return quantia * 0.2;
        }
        else{
            return quantia * 0.15;
        }
    }
}
