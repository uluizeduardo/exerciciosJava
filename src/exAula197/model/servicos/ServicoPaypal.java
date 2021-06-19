package exAula197.model.servicos;

public class ServicoPaypal implements ServicoOnlideDePagamento{

    public static final double TAXAPORCENTAGEM = 0.02;
    public static final double JUROSMENSAIS = 0.01;

    public double juroPorPagamento(double quantia){
        return quantia * TAXAPORCENTAGEM;
    }

    public double juroMensal(double quantia, int meses){
        return quantia * JUROSMENSAIS * meses;
    }
}
