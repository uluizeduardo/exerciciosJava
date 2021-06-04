package ExAula37;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variável
        double X,Y;

        //Entrada de dados
        System.out.println("Informe o valor de X: " );
        X = scan.nextDouble();
        System.out.println("Informe o valor de Y: " );
        Y = scan.nextDouble();

        //Condicional
        if (X == 0.0 && Y == 0.0){
            System.out.println("Origem");
        }else if (X > 0 && Y > 0){
            System.out.println("Q1");
        }else if (X < 0 && Y > 0){
            System.out.println("Q2");
        }else if (X < 0 && Y < 0){
            System.out.println("Q3");
        }else if (X > 0 && Y < 0){
            System.out.println("Q4");
        }
    }
}
