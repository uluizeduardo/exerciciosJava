package ExAula37;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Variável
        int num;

        //Entrada de dados
        System.out.println("Informe um número: ");
        num = scan.nextInt();

        //Condicional
        if (num < 0 ){
            System.out.println("NÚMERO NEGATIVO");
        }else {
            System.out.println("NÚMERO POSITIVO");
        }
    }
}
