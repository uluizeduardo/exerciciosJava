package exAula121.application;

import exAula121.entities.Client;
import exAula121.entities.Order;
import exAula121.entities.OrderItem;
import exAula121.entities.Product;
import exAula121.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Entrada de dados
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());

        //Instância da classe Client para gravar os dados a cima através do construtor
        Client client = new Client(name, email, birthDate);

        //Entrada de dados
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        //Instância da classe Order para gravar os dados a cima através do construtor
        Order order = new Order(new Date(), status, client);

        //Entrada de dados
        System.out.print("How many items to this order? ");
        int n = scan.nextInt();

        //For para gravar os dados
        for (int i = 0; i < n; i++) {
            //Entrada de dados
            System.out.println("Enter #"+ (1 + i) + " item data:");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            Double productPrice = scan.nextDouble();

            //Instância da classe Product para gravar os dados a cima através do construtor
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = scan.nextInt();

            //Instância da classe OrderItem para gravar os dados a cima através do construtor
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        //Saída de dados
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);
    }
}
