package exAula73;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Entrada de dados
        System.out.println("Qual o valor do dolar? ");
        ConversorDeMoedas.dolar = scan.nextDouble();

        System.out.println("Quantos dolares você vai comprar? ");
        ConversorDeMoedas.qtd = scan.nextDouble();

        //Saída de dados
        System.out.printf("O total em Reais é = %.2f", ConversorDeMoedas.cotacao());


    }
}
