package ExAula37;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variável
        int qtd, cod;
        double total;
        double valor = 0;

        //Entrada de dados
        System.out.println("Informe o código de um item: " );
        cod = scan.nextInt();
        System.out.println("Informe a quantidade de itens: " );
        qtd = scan.nextInt();

        //Condicional
        if (cod == 1){
            valor = 4.00;
        }else if (cod == 2){
            valor = 4.50;
        }else if (cod == 3){
            valor = 5.00;
        }else if (cod == 4){
            valor = 2.00;
        }else if (cod == 5){
            valor = 1.50;
        }

        //Cálculo
        total = qtd * valor;

        //Saída de dados
        System.out.printf("Total: R$ %.2f ", total);
    }
}
