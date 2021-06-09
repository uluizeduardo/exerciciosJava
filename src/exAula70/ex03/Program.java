package exAula70.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Instância da classe Aluno
        Aluno aluno = new Aluno();

        //Entrada de dados
        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scan.nextLine();
        System.out.println("Informe a nota1: ");
        aluno.n1 = scan.nextDouble();
        //Condicional  para verificar se a nota1 é maior que 30
        while (aluno.n1 > 30){
            System.out.println("O aluno não pode ter nota maior que 30 no primeiro semestre");
            System.out.println("Informe novamente a nota1: ");
            aluno.n1 = scan.nextDouble();
        }
        //Entrada de dados
        System.out.println("Informe a nota2: ");
        aluno.n2 = scan.nextDouble();
        System.out.println("Informe a nota3: ");
        aluno.n3 = scan.nextDouble();

        //Saida de dados
        System.out.printf("GRADE FINAL: %.2f%n", aluno.mediaDoAluno());

        //Condicional para verificar se o aluno sera aprovado ou nao
        if (aluno.mediaDoAluno() < 60){
            System.out.println("REPROVADO");
            System.out.println("Faltou " + aluno.pontosFaltando() + " Pontos");
        }else{
            System.out.println("APROVADO");
        }

        scan.close();
    }
}
