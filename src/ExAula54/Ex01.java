package ExAula54;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        int x;

        //Entratada de dados
        System.out.println("Informe o valor de X: ");
        x = scan.nextInt();

        //Condicional
        for ( int i = 0; i <= x ; i++) {
            if (i %2 != 0){
                System.out.println(i);
            }
        }
    }
}
