package ExAula49;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variável
        double senha;

        //Entrada de dados
        System.out.println("Informe a senha: ");
        senha = scan.nextInt();

        //Condicional
        while (senha != 2002){
            System.out.println("Senha inválida ");
            System.out.println("Informe a senha: ");
            senha = scan.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
