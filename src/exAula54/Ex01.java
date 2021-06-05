/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
Exemplo:

Entrada:     |      Saída       |
             |                  |
    8        |        1         |
             |        3         |
             |        5         |
             |        7         |
 */
package exAula54;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        int x;

        //Entratada de dados
        System.out.println("Informe o valor de X: ");
        x = scan.nextInt();

        //Condicional
        for ( int i = 0; i <= x ; i++) {
            if (i %2 != 0){
                System.out.println(i);
            }
        }
    }
}
