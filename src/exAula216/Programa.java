package exAula216;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> votos = new LinkedHashMap<>();//Map com implementação LinkedHasMap

        System.out.println("Informe o caminho do arquivo: ");
        String caminho = scan.nextLine();//Recebe o caminho do arquivo

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){//try com BuffereadReader para ler o documento

            String linha = br.readLine();
            while (linha != null){

                String[] campos = linha.split(",");//vetor temporário
                String nome = campos[0];//nome recebe o dado do compos[0]
                int voto = Integer.parseInt(campos[1]);//voto recebe campos[1]

                if (votos.containsKey(nome)){//verificar se a chave "nome" está sendo mapeada
                    int votosAteAgora = votos.get(nome);
                    votos.put(nome, voto + votosAteAgora);
                }
                else{
                    votos.put(nome, voto);
                }
                linha = br.readLine();
            }
            //Saída de dados
            System.out.println();
            for (String key : votos.keySet()){
                System.out.println(key + ": " + votos.get(key));
            }
        }
        catch (IOException ex){
            System.out.println("Error: Caminho inexistente! ");
        }

    }
}
