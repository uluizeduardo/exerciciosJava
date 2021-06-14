package exAula131.application;

import exAula131.entities.ImportedProduct;
import exAula131.entities.Product;
import exAula131.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);
        List<Product> list = new ArrayList<>();


        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scan.next().toUpperCase().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();

            if (ch == 'I'){
                System.out.print("Customs fee: ");
                double customsFree = scan.nextDouble();
                list.add(new ImportedProduct(name, price, customsFree));
            }else if (ch == 'C'){
                list.add(new Product (name, price));
            }else if(ch == 'U'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manuFatureDate = sdf.parse(scan.next());
                list.add(new UsedProduct(name, price, manuFatureDate));
            }else {
                System.out.print("Letra inválida");
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : list){
            System.out.println(p.priceTag());
        }
    }
}
