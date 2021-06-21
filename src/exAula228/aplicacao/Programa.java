package exAula228.aplicacao;

import exAula228.entidades.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String caminho = scan.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){//Abrir o arquivo

            List<Produto> listaDeProdutos = new ArrayList<>();//Instância de lista de produtos

            String linha = br.readLine();//Ler a linha
            while (linha != null){//Enquanto a linha for diferente de nulo

                String[] campos = linha.split(",");//Recortar string em 2 com base na virgula
                listaDeProdutos.add(new Produto(campos[0], Double.parseDouble(campos[1])));//Instância do produto
                linha = br.readLine();//Ler proxima linha
            }

            //Achar soma dos preços
            double media = listaDeProdutos.stream()
                    .map(p -> p.getPreco())//Stream só com os preços dos produtos
                    .reduce(0.0, (x,y) -> x + y) / listaDeProdutos.size();//Faz o somatório dos preços e acha o preço médio

            System.out.println("Média de preços: " + String.format("%.2f", media));//Mostrar na tela a média

            Comparator<String> comparador = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());//Função que compara 2 strings (Comparator)

            List<String> nomes = listaDeProdutos.stream()
                    .filter(p -> p.getPreco() < media)//Filtro de preço menor que a média
                    .map(p -> p.getNome())//Strean contendo só os nomes que foram filtrados a cima
                    .sorted(comparador.reversed())//Comparator ao contrário (Decrescente)
                    .collect(Collectors.toList());//Transformar stream em lista

            nomes.forEach(System.out::println);//Mostrar na tela os dados da lista nomes

        }
        catch (IOException ex ){
            System.out.println("Error: " + ex.getMessage());
        }
        scan.close();
    }
}
