package exAula197.aplicacao;

import exAula197.model.entidades.Contrato;
import exAula197.model.entidades.Prestacao;
import exAula197.model.servicos.ServicoDePagamento;
import exAula197.model.servicos.ServicoPaypal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os dados do contrato: ");
        System.out.print("Número: ");
        int numero  = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        Date data = sdf.parse(scan.next());
        System.out.print("Valor do contrato: ");
        double valorTotal = scan.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Insira o número de parcelas: ");
        int meses = scan.nextInt();

        ServicoDePagamento servicoDePagamento = new ServicoDePagamento(new ServicoPaypal());

        servicoDePagamento.ProcessamentoDeContrato(contrato, meses);

        System.out.println("Prestações: ");
        for (Prestacao item : contrato.getListPrestacao()){
            System.out.println(item);
        }
        scan.close();
    }
}
