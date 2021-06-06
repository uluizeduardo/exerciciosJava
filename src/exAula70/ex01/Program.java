package exAula70.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Instãncia do objeto Rectangle
        Rectangle rectangle = new Rectangle();

        //Entrada de dados
        System.out.println("Informe a width");
        rectangle.width = scan.nextDouble();
        System.out.println("Informe a height");
        rectangle.height = scan.nextDouble();

        //Saída de dados
        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagonal());
    }
}
