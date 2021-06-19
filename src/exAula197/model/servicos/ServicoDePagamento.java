package exAula197.model.servicos;

import exAula197.model.entidades.Contrato;
import exAula197.model.entidades.Prestacao;

import java.util.Calendar;
import java.util.Date;

public class ServicoDePagamento {

    private ServicoOnlideDePagamento servicoOnlideDePagamento;

    public ServicoDePagamento(ServicoOnlideDePagamento servicoOnlideDePagamento) {
        this.servicoOnlideDePagamento = servicoOnlideDePagamento;
    }

    //Lógica para imprimir os dados conforme o exercício
    public void ProcessamentoDeContrato(Contrato contrato, int meses){
        double cotaBasica = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            Date data = addMeses(contrato.getData(), i);
            double atualizacaoDaCotaBasica = cotaBasica + servicoOnlideDePagamento.juroMensal(cotaBasica, i);
            double cotaTotal = atualizacaoDaCotaBasica + servicoOnlideDePagamento.juroPorPagamento(atualizacaoDaCotaBasica);
            contrato.addPrestacao(new Prestacao(data, cotaTotal));
        }
    }
    //Método auxiliar
    private Date addMeses(Date data, int n){
        Calendar cal = Calendar.getInstance();//Instância do calendario
        cal.setTime(data);//setou a data
        cal.add(Calendar.MONTH, n);//adicionou o mês atráves de n
        return cal.getTime();//retornou a data
    }
}
