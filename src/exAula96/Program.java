package exAula96;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Lista
        List<Funcionario> list = new ArrayList<>();

        //Entrada de dados
        System.out.print("Quantos funcionarios você deseja cadastrar? ");
        int n = scan.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Reserva #" +(i+1));
            System.out.print("Id: ");
            Integer id = scan.nextInt();
            System.out.print("Nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Salario: ");
            Double salario = scan.nextDouble();

            list.add(new Funcionario(id,nome,salario));
            System.out.println();

        }

        System.out.print("Informe o id do funcionário que terá o salario almentado: ");
        int id = scan.nextInt();
        //Expressão lambda
        Funcionario result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (result == null){
            System.out.print("Esse id não existe! ");

        }else{
            System.out.print("Informe o valor da porcentagem:  ");
            Double porcentagem = scan.nextDouble();
            result.aumentoSalario(porcentagem);
        }

        //Saída de dados
        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario obj : list){
            System.out.println(obj);
        }
    }
}
