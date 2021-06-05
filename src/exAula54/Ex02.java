/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
Exemplo:

Entrada:     |      Saída       |
             |                  |
    5        |                  |
    14       |        2 in      |
    123      |        3 out     |
    10       |                  |
    -25      |                  |
    32       |                  |
 */
package exAula54;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int n, x;
        int in = 0;
        int out = 0;

        //Entrada de dados
        System.out.println("Informe o valor de N: ");
        n = scan.nextInt();

        //Condicional
        for (int i = 1; i <= n; i++){
            System.out.println("Digite um número: ");
            x = scan.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }
        //Saída de dados
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
