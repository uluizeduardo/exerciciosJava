package exAula197.model.servicos;

public interface ServicoOnlideDePagamento {

    double juroPorPagamento(double quantia);
    double juroMensal(double quantia, int meses);
}
