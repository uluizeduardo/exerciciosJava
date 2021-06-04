package ExAula30;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variáveis
        int A, B, C, D;

        //Entrada de dados
        System.out.println("Informe o valor de A: ");
        A = scan.nextInt();
        System.out.println("Informe o valor de B: ");
        B = scan.nextInt();
        System.out.println("Informe o valor de C: ");
        C = scan.nextInt();
        System.out.println("Informe o valor de D: ");
        D = scan.nextInt();

        //Variável que faz o cálculo da diferênça
        int dif = ((A * B) - (C * D));

        //Saída de dados
        System.out.println("IDIFERENÇA = " + dif);
    }
}
