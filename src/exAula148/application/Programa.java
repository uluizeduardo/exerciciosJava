package exAula148.application;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import exAula148.entities.Produto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
        String arquivoFonteStr = scan.nextLine();

        File arquivoFonte = new File(arquivoFonteStr);
        String pastaDeOrigemStr = arquivoFonte.getParent();

        boolean novapasta = new File(pastaDeOrigemStr + "\\out").mkdir();

        String arquivoDeDestinoStr = pastaDeOrigemStr + "\\out\\summary.csv";


        try (BufferedReader bfr = new BufferedReader(new FileReader(arquivoFonteStr))) {

            String itemCsv  =  bfr.readLine();
            while (itemCsv != null){

                String[] Campos = itemCsv.split(", ");
                String nome = Campos[0];
                double preco = Double.parseDouble(Campos[1]);
                int quantidade = Integer.parseInt(Campos[2]);

                list.add(new Produto(nome, preco, quantidade));

                itemCsv = bfr.readLine();
            }
        }
        catch (IOException ex){
            System.out.println("Error " + ex.getMessage());
        }
    }
}

