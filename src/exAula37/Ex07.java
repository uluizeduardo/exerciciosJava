/*
    Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
    de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
    ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
    Se o ponto estiver na origem, escreva a mensagem “Origem”.
    Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
    situação.

    Exemplos:

    Entrada: 4.5 -2.2
    Saída: Q4
 */

package exAula37;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variável
        double X,Y;

        //Entrada de dados
        System.out.println("Informe o valor de X: " );
        X = scan.nextDouble();
        System.out.println("Informe o valor de Y: " );
        Y = scan.nextDouble();

        //Condicional
        if (X == 0.0 && Y == 0.0){
            System.out.println("Origem");
        }else if (X > 0 && Y > 0){
            System.out.println("Q1");
        }else if (X < 0 && Y > 0){
            System.out.println("Q2");
        }else if (X < 0 && Y < 0){
            System.out.println("Q3");
        }else if (X > 0 && Y < 0){
            System.out.println("Q4");
        }
    }
}
