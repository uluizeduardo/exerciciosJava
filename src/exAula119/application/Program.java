package exAula119.application;

import exAula119.entities.Department;
import exAula119.entities.HourContract;
import exAula119.entities.Worker;
import exAula119.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Entrada de dados
        System.out.print("Enter department's name: ");
        String departmentName = scan.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scan.nextLine();
        System.out.print("Level: ");
        String workerLevel = scan.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = scan.nextInt();
        //For para inserir dados n vezes
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHours = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int durationHours = scan.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHours, durationHours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); //recortando o string (MM/YYYY) e adicionando a variável month
        int year = Integer.parseInt(monthAndYear.substring(3)); //recortando o string e adicionando a variável year

        //Saída de dados
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

    }
}
