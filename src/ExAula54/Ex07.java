package ExAula54;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        int x = 0;

        //Condicional
        for (double i = 1; i <= 5; i++) {
            x++;
            System.out.print(x + " ");
            System.out.print(x * x + " ");
            System.out.print(x * x * x + " ");
            System.out.println();


        }
    }
}
