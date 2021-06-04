package ExAula37;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variável
        double valor;

        //Entrada de dados
        System.out.println("Informe um valor: " );
        valor = scan.nextDouble();

        //Condicional
        if (valor < 0 || valor > 100){
            System.out.print("Fora de intervalo" );
        }else if (valor <= 25.0){
            System.out.print("Intervalo [0,25]" );
        }else if (valor <= 55.0){
            System.out.print("Intervalo [25,50]" );
        }else if (valor <= 75.0){
            System.out.print("Intervalo [55,75]" );
        }else if (valor <= 100){
            System.out.print("Intervalo [75,100]" );
        }

    }
}
