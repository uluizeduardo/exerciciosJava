/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

    Exemplo:

    Entrada: 16 2
    Saída: O JOGO DUROU 10 HORA(S)
*/
package exAula37;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int horaInicial;
        int horaFinal;
        int duracao;

        //Entrada de dados
        System.out.println("Informe o valor de A: ");
        horaInicial = scan.nextInt();
        System.out.println("Informe o valor de B: ");
        horaFinal = scan.nextInt();

        //Condicional
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24 - horaInicial + horaFinal;
        }
        //Saída de dados
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        scan.close();

    }
}
