/*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente.

    Exemplo:

    Entrada: 6 24
    Saída: Sao Múltiplos
*/
package exAula37;


import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        int A, B;

        //Entrada de dados
        System.out.println("Informe o valor de A: ");
        A = scan.nextInt();
        System.out.println("Informe o valor de B: ");
        B = scan.nextInt();

        //Condicional
        if (A % B == 0 || B % A == 0){
            System.out.println("São múltiplos");
        }else {
            System.out.println("Não são múltiplos");
        }
    }
}
