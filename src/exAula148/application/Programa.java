package exAula148.application;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import exAula148.entities.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();//Lista de produtos

        System.out.println("Digite o caminho de arquivo: ");
        String arquivoFonteStr = scan.nextLine();//ler o caminho do arquivo

        File arquivoFonte = new File(arquivoFonteStr);//instância do arquivo File
        String pastaDeOrigemStr = arquivoFonte.getParent();//pegando o caminho do File(arquivoFonte)

        boolean novapasta = new File(pastaDeOrigemStr + "\\out").mkdir();//Criar uma nova diretório(Pasta)

        String arquivoDeDestinoStr = pastaDeOrigemStr + "\\out\\summary.csv";


        try (BufferedReader br = new BufferedReader(new FileReader(arquivoFonteStr))) {//Instância para ler arquivos

            String itemCsv  =  br.readLine();
            while (itemCsv != null){

                String[] campos = itemCsv.split(",");//vetor para armazenar os dados temporariamente
                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                list.add(new Produto(nome, preco, quantidade));//inserir dados na lista de produtos

                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDeDestinoStr))) {//Instância para escrever em arquivos
                for(Produto item : list){//Lógica para escrever no arquivo
                    bw.write(item.getNome() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(arquivoDeDestinoStr + " CRIADO! ");
            } catch (IOException ex){
                System.out.println("Erro ao gravar arquivo: " + ex.getMessage());
            }
        }
        catch (IOException ex){
            System.out.println("Error " + ex.getMessage());
        }
        scan.close();
    }
}

