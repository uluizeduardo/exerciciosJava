package exAula82;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaBancaria contaBancaria;

        //Entrada de dados
        System.out.println("Informe o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("Informe o nome do titular da conta: ");
        String nome = scan.next();

        System.out.println("Deseja depositar algum valo? (y/n) ");
        char resposta = scan.next().charAt(0);

        //Condicional
        if (resposta == 'y'){
            System.out.print("Informe o valor a ser depositado: R$");
            double valorInicial = scan.nextDouble();
            contaBancaria = new ContaBancaria(numeroConta, nome, valorInicial);
        }else {
            contaBancaria = new ContaBancaria(numeroConta, nome);
        }
        //Saída de dados
        System.out.println("Dados da conta: ");
        System.out.println(contaBancaria);
        System.out.println();

        //Deposito
        System.out.print("Informe um valor para deposito: ");
        double deposito = scan.nextDouble();
        contaBancaria.addSaldo(deposito);
        System.out.println("Dados atualizados: ");
        System.out.println(contaBancaria);
        System.out.println();

        //Saque
        System.out.print("Informe o valor do saque: ");
        double saque = scan.nextDouble();
        contaBancaria.rmvSaldo(saque);
        System.out.println("Dados atualizados: ");
        System.out.println(contaBancaria);




    }
}
