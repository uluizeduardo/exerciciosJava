/*
    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    Lembrando que, por definição, fatorial de 0 é 1.

    Exemplo:

    Entrada : 4
    Saída: 24
 */
package exAula54;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int n;
        double fat = 1;
        //Entrada de dados
        System.out.println("Informe o valor de X: ");
        n = scan.nextInt();

        //Condicional
        for (int i = 1; i <= n; i++) {
                fat *= i;
            }
        System.out.println(" FAT " + fat);
    }
}
