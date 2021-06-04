package ExAula30;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variáveis
        double raio = 0;
        double pi = 3.14159;
        double formula = pi * Math.pow(raio, 2.0);

        //Entrada de dados
        System.out.println("Informe um valor do raio do circulo: ");
        raio = scan.nextDouble();
        formula = pi * raio * raio;

        //Saída de dados
        System.out.printf("A = %.4f%n", formula);

        scan.close();
    }
}
