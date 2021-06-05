/*
    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    decimais.

    MOSTRAR NA TELA ESSE RESULTADO:
    Entrada:
    25
    100
    5.50

    Saída:
    NUMBER = 25
    SALARY = U$ 550.00
*/
package exAula30;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variáveis
        int num;
        double horasTrabalhadas;
        double valorPorHora;

        //Entrada de dados
        System.out.println("Informe o número do funcionário: ");
        num = scan.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scan.nextInt();
        System.out.println("Informe o valor por hora desse funcionário:  ");
        valorPorHora = scan.nextDouble();

        //Variável que faz o calculo
        double salary = horasTrabalhadas * valorPorHora;

        //Saída de dados
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = %.2f", salary);
    }
}
