package ExAula49;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variáveis
        int cod;
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        //Entrada de dados
        System.out.println("Informe um código: ");
        cod = scan.nextInt();

        //Condicional
        while (cod != 4 ){
            if (cod == 1){
                alcool++;
            }else if (cod == 2){
                gasolina++;
            }else if (cod == 3){
                disel++;
            }
            System.out.println("Informe um código: ");
            cod = scan.nextInt();
        }

        //Saída de dados
        System.out.println("MUITO OBRIGADO! ");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Dísel: " + disel);

    }
}
