/*
    Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
package exAula54;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variáveis
        int n;
        double a, b;
        System.out.println("Informe o valor de X: ");
        n = scan.nextInt();

        for (int i = 0 ; i < n; i++){
            System.out.println("Informe o valor de A: ");
            a = scan.nextInt();
            System.out.println("Informe o valor de B: ");
            b = scan.nextInt();

            double div = a / b;

            if ( b == 0.0 ){
                System.out.println("Divisão impossível ");
            }else {
                System.out.println("A Divisão é: " + div);
            }
        }
    }
}
