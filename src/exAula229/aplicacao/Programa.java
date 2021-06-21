package exAula229.aplicacao;

import exAula229.entidades.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String arquivo = scan.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){

            List<Funcionario> listaDeFuncionario = new ArrayList<>();

            String leituraDaLinha = br.readLine();
            while (leituraDaLinha != null){

                String[] dados = leituraDaLinha.split(",");
                listaDeFuncionario.add(new Funcionario(dados[0], dados[1], Double.parseDouble(dados[2])));
                leituraDaLinha = scan.nextLine();
            }

            System.out.println("Informe o salario: ");
            double salario = scan.nextDouble();

            List<String> emailFuncionario = listaDeFuncionario.stream()
                    .filter(f -> f.getSalario() > salario)
                    .map(f -> f.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            System.out.printf("Email dos funcionarios com salario maior que " + String.format("%.2f", salario) + ":");
            emailFuncionario.forEach(System.out::println);

            double soma = listaDeFuncionario.stream()
                    .filter( f -> f.getNome().charAt(0) == 'M')
                    .map(f -> f.getSalario())
                    .reduce(0.0, (x,y) -> x + y);

            System.out.printf("Soma do salário de pessoas cujo nome começa com 'M' " + String.format("%.2f", soma));
        }
        catch (IOException ex){
            System.out.println("ERROR: " + ex.getMessage());
        }
        scan.close();
    }
}
