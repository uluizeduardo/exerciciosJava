package ExAula45;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int x, y;

        //Entrada de dados
        System.out.println("Informe o valor de X: ");
        x = scan.nextInt();
        System.out.println("Informe o valor de Y: ");
        y = scan.nextInt();

        //Condicional
        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("PRIMEIRO");
            }else if (x < 0 && y > 0){
                System.out.println("SEGUNDO");
            }else if (x < 0 && y < 0){
                System.out.println("TERCEIRO");
            }else {
                System.out.println("QUARTO");
            }
            System.out.println("Informe NOVAMENTE o  valor de X: ");
            x = scan.nextInt();

            System.out.println("Informe NOVAMENTE o  valor de Y: ");
            y = scan.nextInt();
        }

    }
}
