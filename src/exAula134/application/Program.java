package exAula134.application;

import exAula134.entities.Company;
import exAula134.entities.Individual;
import exAula134.entities.TaxPayer;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        //Entrada de dados
        System.out.print("Enter the number of tax payers: ");
        int n =  scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.print("Individual or company (i/c)? ");
            char ch = scan.next().toUpperCase().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            double anualIcome = scan.nextDouble();
            if (ch == 'I'){
                System.out.print("Health expenditures: ");
                double healthExpendtures = scan.nextDouble();
                list.add(new Individual(name, anualIcome, healthExpendtures));
            }else if (ch == 'C'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = scan.nextInt();
                list.add(new Company(name, anualIcome, numberOfEmployees));
            }
        }
        //Saída de dados
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer tax : list){
            double tx = tax.tax();
            System.out.println(tax);
            sum += tx;
        }

        System.out.println("TOTAL TAXES: $" + String.format("%.2f ", sum));
    }
}
