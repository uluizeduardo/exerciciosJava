package ExAula54;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variaveis
        int n;
        double v1, v2, v3;
        double media = 0;

        //Entrada de dados
        System.out.println("Informe o valor de N: ");
        n = scan.nextInt();

        //Condicional
        for (int i = 0; i < n; i++) {
            System.out.println("Informe o valor 1");
            v1 = scan.nextDouble();
            System.out.println("Informe o valor 2");
            v2 = scan.nextDouble();
            System.out.println("Informe o valor 3");
            v3 = scan.nextDouble();

            media = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10;

            System.out.printf( "RESULT"+ i + ": " + v1 + " " + v2 + " " + v3 + " =  %.1f", media);
            System.out.println();
        }
    }
}
