package ExAula30;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Variáveis
        int valor1;
        int valor2;
        int soma;

        //Entrada de dados
        System.out.println("Digite o valor1: ");
        valor1 = ler.nextInt();
        System.out.println("Digite o valor2: ");
        valor2 = ler.nextInt();
        soma = valor1 + valor2;

        //Saída de dados
        System.out.println("A soma dos valores é: " + soma);
    }
}
