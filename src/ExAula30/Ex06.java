package ExAula30;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variáveis
        double A, B, C;

        //Entrada de dados
        System.out.println("Informe o valor de A: ");
        A = scan.nextDouble();
        System.out.println("Informe o valor de B: ");
        B = scan.nextDouble();
        System.out.println("Informe o valor de C: ");
        C = scan.nextDouble();
        //Variáveis com seus respectivos cálculos
        double triangulo = (A * C) / 2;
        double circulo = Math.PI * Math.pow(C, 2.0);
        double trapezio = ((A + B) / 2) * C;
        double quadrado = Math.pow(B, 2.0);
        double retangulo = A * B;

        //Saída de dados
        System.out.printf("TRIANGULO: %.3f", triangulo);
        System.out.println();
        System.out.printf("CIRCULO: %.3f", circulo);
        System.out.println();
        System.out.printf("TRAPÉZIO: %.3f", trapezio);
        System.out.println();
        System.out.printf("QUADRADO: %.3f", quadrado);
        System.out.println();
        System.out.printf("RETÂNGULO: %.3f", retangulo);
    }
}
