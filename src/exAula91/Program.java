package exAula91;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Quantos quartos serão alugados? ");
        int n = scan.nextInt();

        //Vetor de 10 elementos
        Estudantes[] vet = new Estudantes[9];
        //Inserção dos dados no vetor: vet
        for (int i = 0; i < n ; i++) {
            scan.nextLine();
            System.out.println("Reserva #" +(i+1));
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.nextLine();
            System.out.print("Quarto: ");
            int quarto = scan.nextInt();
            vet[quarto] = new Estudantes(nome, email, quarto);
            System.out.println();
        }
        //Saída de dados
        System.out.println("Quartos ocupados: ");
        //For para pegar os dados do vetor
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != null){
                System.out.println(vet[i]);
            }
        }
    }
}
