package ExAula37;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        int num;

        //Entrada de dados
        System.out.println("Informe um número: ");
        num = scan.nextInt();

        //Condicional
        if (num %2 == 0){
            System.out.println("O NÚMERO " + num + " É PAR");
        }else {
            System.out.println("O NÚMERO " + num + " É ÍMPAR");
        }
    }
}
