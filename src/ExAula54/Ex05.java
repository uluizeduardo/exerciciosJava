package ExAula54;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int n;
        double fat = 1;
        //Entrada de dados
        System.out.println("Informe o valor de X: ");
        n = scan.nextInt();

        //Condicional
        for (int i = 1; i <= n; i++) {
                fat *= i;
            }
        System.out.println(" FAT " + fat);

    }
}
