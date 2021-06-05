/*
    Ler um número inteiro N e calcular todos os seus divisores.

    Exemplo:

    Entrada:     |      Saída       |
                |                  |
       6        |        1         |
                |        2         |
                |        3         |
                |        6         |
 */
package exAula54;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variáveis
        int num;

        //Entrada de dados
        System.out.println("Informe um número: ");
        num = scan.nextInt();

        //Condicional
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
