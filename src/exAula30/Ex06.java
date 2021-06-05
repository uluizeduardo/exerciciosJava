    /*
    Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
    mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.


    MOSTRAR NA TELA ESSE RESULTADO:
    Entrada:
    3.0 4.0 5.2

    Saída:
    TRIANGULO: 7.800
    CIRCULO: 84.949
    TRAPEZIO: 18.200
    QUADRADO: 16.000
    RETANGULO: 12.000
*/
package exAula30;

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
