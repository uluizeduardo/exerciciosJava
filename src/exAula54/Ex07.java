/*
    Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
    começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
    exemplo.

    Entrada:     |      Saída       |
                 |                  |
        5        |     1  1  1      |
                 |     2  4  8      |
                 |     3  9  27     |
                 |     4  16 64     |
                 |     5  25 125    |
 */
package exAula54;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        int x = 0;

        //Condicional
        for (double i = 1; i <= 5; i++) {
            x++;
            System.out.print(x + " ");
            System.out.print(x * x + " ");
            System.out.print(x * x * x + " ");
            System.out.println();
        }
    }
}
