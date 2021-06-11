package exAula100;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Informe o valor de linhas ");
        int m = scan.nextInt();
        System.out.print("Informe o numero de colunas ");
        int n = scan.nextInt();
        int[][] mat = new int[m][n];

        //For para incrementar a matriz
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println("Escolha um valor na matriz: ");
        int x = scan.nextInt();
        //For para percorrer a matriz
        for (int i = 0; i< mat.length; i++){
            for (int j =0; j< mat[i].length; j++){
                if (mat[i][j] == x){
                    System.out.println("Posição " + i + "," + j + ": ");
                    if(j > 0){
                        System.out.println("Esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("Em cima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length -1){
                        System.out.println("Direita " + mat[i][j+1]);
                    }
                    if (i < mat.length -1){
                        System.out.println("Em baixo: " + mat[i+1][j]);
                    }
                }
            }
        }
        System.out.println("Valor Invalido, encerrando programa...");
    }
}
