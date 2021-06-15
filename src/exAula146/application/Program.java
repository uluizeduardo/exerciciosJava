package exAula146.application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scan.nextInt();
        System.out.print("Holder: ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.print("Initial balance: ");
        double balance = scan.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scan.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = scan.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New Balance: %.2f" , account.getBalance());

        }
        catch (DomainException ex){
            System.out.println(ex.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error ");
        }
        scan.close();
    }
}
