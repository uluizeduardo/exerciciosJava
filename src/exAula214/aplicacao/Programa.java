package exAula214.aplicacao;

import exAula214.entidades.Aluno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos alunos para o curso A? ");
        int nA = scan.nextInt();

        Set<Aluno> set = new HashSet<>();
        for (int i = 0; i < nA; i++) {
            System.out.print("Informe a matricula do aluno: #" + (i+1) + " ");
            int matricula = scan.nextInt();

            set.add(new Aluno(matricula));
        }

        System.out.print("Quantos alunos para o curso B? ");
        int nB = scan.nextInt();
        for (int i = 0; i < nB; i++) {
            System.out.print("Informe a matricula do aluno: #" + (i+1) + " ");
            int matricula = scan.nextInt();
            set.add(new Aluno(matricula));
        }

        System.out.print("Quantos alunos para o curso C? ");
        int nC = scan.nextInt();
        for (int i = 0; i < nC; i++) {
            System.out.print("Informe a matricula do aluno: #" + (i+1) + " ");
            int matricula = scan.nextInt();
            set.add(new Aluno(matricula));
        }

        System.out.println();
        System.out.println("Total de Alunos: " + set.size());
    }
}
