package ExAula37;

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
