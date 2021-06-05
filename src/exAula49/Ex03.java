/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.

Exemplo:

 Entrada:     |      Saída            |
              |                       |
    8         |     MUITO OBRIGADO    |
    1         |     Alcool: 1         |
    7         |     Gasolina: 2       |
    2         |     Diesel: 0         |
    2         |                       |
    4         |                       |
 */
package exAula49;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int cod;
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        //Entrada de dados
        System.out.println("Informe um código: ");
        cod = scan.nextInt();

        //Condicional
        while (cod != 4 ){
            if (cod == 1){
                alcool++;
            }else if (cod == 2){
                gasolina++;
            }else if (cod == 3){
                disel++;
            }
            System.out.println("Informe um código: ");
            cod = scan.nextInt();
        }

        //Saída de dados
        System.out.println("MUITO OBRIGADO! ");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Dísel: " + disel);

    }
}
