/*
    Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

    MOSTRAR NA TELA ESSE RESULTADO:
    Entrada:
    12 1 5.30
    16 2 5.10

    Saída/Resultado:
    VALOR A PAGAR: R$ 15.50
*/
package exAula30;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variáveis
        int cod;
        double valor;
        int quantidade;

        //Entrada de dados
        System.out.println("Informa o código da peça 1: ");
        cod = scan.nextInt();
        System.out.println("Informa a quantidade da peças: ");
        quantidade = scan.nextInt();
        System.out.println("Informa o valor da peça 1: ");
        valor = scan.nextDouble();
        double totalPeça1 = valor * quantidade;

        System.out.println("Informa o código da peça 2: ");
        cod = scan.nextInt();
        System.out.println("Informa a quantidade da peças: ");
        quantidade = scan.nextInt();
        System.out.println("Informa o valor da peça 2: ");
        valor = scan.nextDouble();
        double totalPeça2 = valor * quantidade;

        //Cálculo do resultado final
        double total = totalPeça1 + totalPeça2;

        //Saída de dados
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
