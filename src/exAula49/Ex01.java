/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Exemplo:

Entrada:           Saída
2200               Senha Invalida
1020               Senha Invalida
2022               Senha Invalida
2002               Acesso Permitido

*/
package exAula49;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        double senha;

        //Entrada de dados
        System.out.println("Informe a senha: ");
        senha = scan.nextInt();

        //Condicional
        while (senha != 2002){
            System.out.println("Senha inválida ");
            System.out.println("Informe a senha: ");
            senha = scan.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
