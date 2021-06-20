package exAula206.aplicacao;

import exAula206.servicos.CalculadoraDeServico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Integer> list = new ArrayList<>();

        String caminho = "/home/luiz/Documentos/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){

            String linha = br.readLine();
            while (linha != null){
                list.add(Integer.parseInt(linha));
                linha = br.readLine();
            }

            Integer x = CalculadoraDeServico.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        }
        catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
