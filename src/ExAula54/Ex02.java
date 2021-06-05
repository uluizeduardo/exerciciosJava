package ExAula54;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int n, x;
        int in = 0;
        int out = 0;

        //Entrada de dados
        System.out.println("Informe o valor de N: ");
        n = scan.nextInt();

        //Condicional
        for (int i = 1; i <= n; i++){
            System.out.println("Digite um número: ");
            x = scan.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }
        //Saída de dados
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
