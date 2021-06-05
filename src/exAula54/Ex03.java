/*
    Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
    de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
    conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
    peso 5.
 */
package exAula54;

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
