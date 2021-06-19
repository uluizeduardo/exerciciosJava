package exAula192.aplicacao;

import exAula192.model.entidades.AlugelDeCarro;
import exAula192.model.entidades.Veiculo;
import exAula192.model.servicos.ServicoDeAluguel;
import exAula192.model.servicos.ServicoFiscalDoBrasil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os dados de aluguel: ");
        System.out.print("Modelo do carro: ");
        String modelo  = scan.nextLine();
        System.out.print("Data e hora que pegou (dd/MM/yyyy HH:mm): ");
        Date pegou = sdf.parse(scan.nextLine());
        System.out.print("Data e hora que devolveu (dd/MM/yyyy HH:mm): ");
        Date devolveu = sdf.parse(scan.nextLine());


        AlugelDeCarro aluguel = new AlugelDeCarro(pegou, devolveu, new Veiculo(modelo));

        System.out.print("Insira o preço por hora: ");
        double precoPorHora = scan.nextDouble();
        System.out.print("Insira o preço por dia: ");
        double precoPorDia = scan.nextDouble();

        ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorHora, precoPorDia, new ServicoFiscalDoBrasil());

        servicoDeAluguel.processamentoFiscal(aluguel);


        System.out.println("FATURA");
        System.out.println("Pagamento Básico: " + String.format("%.2f", aluguel.getFatura().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f ", aluguel.getFatura().getImposto()));
        System.out.println("Pagamento Total: " + String.format("%.2f", aluguel.getFatura().PagamentoTotal()));
    }
}
