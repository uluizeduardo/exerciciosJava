/*
    Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
    cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
    menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

    Exemplo:

    Entrada:     |      Saída       |
                 |                  |
    2 2          |    primeiro      |
    3 -2         |    quarto        |
    -8 -1        |    terceiro      |
    -7 1         |    segundo       |
    0 2          |                  |
*/
package exAula49;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int x, y;

        //Entrada de dados
        System.out.println("Informe o valor de X: ");
        x = scan.nextInt();
        System.out.println("Informe o valor de Y: ");
        y = scan.nextInt();

        //Condicional
        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("PRIMEIRO");
            }else if (x < 0 && y > 0){
                System.out.println("SEGUNDO");
            }else if (x < 0 && y < 0){
                System.out.println("TERCEIRO");
            }else {
                System.out.println("QUARTO");
            }
            System.out.println("Informe NOVAMENTE o  valor de X: ");
            x = scan.nextInt();

            System.out.println("Informe NOVAMENTE o  valor de Y: ");
            y = scan.nextInt();
        }

    }
}
