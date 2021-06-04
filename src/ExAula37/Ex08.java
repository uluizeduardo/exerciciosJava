package ExAula37;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Variáveis
        double salario;
        double imposto = 0;

        //Entrada de dados
        System.out.println("Informe o valor do salário: ");
        salario = scan.nextDouble();

        //Condicional
        if (salario <= 2000.0){
            imposto = 0.0;
        }else if (salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.08;

        }else if (salario <= 4500.0){
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

        }else if (salario > 4500.00){
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (imposto == 0.0){
            System.out.println("Isento");
        }else {
            System.out.printf("Imposto é de R$ %.2f", imposto);
        }
    }
}
