package ExAula37;

import java.util.Locale;
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
