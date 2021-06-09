package exAula70.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Instãncia do objeto Funcionario
        Funcionario funcionario = new Funcionario();

        //Entrada de dados
        System.out.println("Imforme o nome do funcionário: ");
        funcionario.nome = scan.nextLine();
        System.out.println("Informe o salário bruto do funcionário: ");
        funcionario.salarioBruto = scan.nextDouble();
        System.out.println();

        //Saída de dados
        System.out.println("Nome: " + funcionario.nome);
        System.out.printf("Salário Bruto: %.2f%n", funcionario.salarioBruto);
        System.out.printf("Imposto: %.2f%n", funcionario.imposto);
        System.out.println();

        System.out.printf("Funcionário: " + funcionario);
        System.out.println();

        //Entrada de dados
        System.out.println("Digite a porcentagem para almentar o salário: ");
        double porcentagem = scan.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.println();

        //Saída de dados
        System.out.println("Dados atualizados: " + funcionario);

    }
}
