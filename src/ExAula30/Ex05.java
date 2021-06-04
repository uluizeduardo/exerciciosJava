package ExAula30;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variáveis
        int cod;
        double valor;
        int quantidade;

        //Entrada de dados
        System.out.println("Informa o código da peça 1: ");
        cod = scan.nextInt();
        System.out.println("Informa a quantidade da peças: ");
        quantidade = scan.nextInt();
        System.out.println("Informa o valor da peça 1: ");
        valor = scan.nextDouble();
        double totalPeça1 = valor * quantidade;

        System.out.println("Informa o código da peça 2: ");
        cod = scan.nextInt();
        System.out.println("Informa a quantidade da peças: ");
        quantidade = scan.nextInt();
        System.out.println("Informa o valor da peça 2: ");
        valor = scan.nextDouble();
        double totalPeça2 = valor * quantidade;

        //Cálculo do resultado final
        double total = totalPeça1 + totalPeça2;

        //Saída de dados
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
