package exAula206.aplicacao;

import exAula206.entidade.Produto;
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

        List<Produto> list = new ArrayList<>();

        String caminho = "/home/luiz/Documentos/in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){

            String linha = br.readLine();
            while (linha != null){
                String[] campos = linha.split(",");
                list.add(new Produto(campos[0], Double.parseDouble(campos[1])));
                linha = br.readLine();
            }

           Produto x = CalculadoraDeServico.max(list);
            System.out.println("Mais Caro: ");
            System.out.println(x);
        }
        catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
