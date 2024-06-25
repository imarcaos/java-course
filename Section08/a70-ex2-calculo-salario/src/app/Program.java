package app;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee ee = new Employee();

        System.out.println("Enter Employer Data:");
        System.out.print("Name: ");
        ee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        ee.grossSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tax: ");
        ee.tax = sc.nextDouble();
        System.out.println(ee);
        sc.nextLine();
        System.out.printf("%nWhich percentage to increase salary: ");
        double percentage = sc.nextDouble();
        sc.nextLine();
        System.out.printf("%nUpdated data: " + ee.name + ", $ %.2f%n", ee.increaseSalary(percentage));
        
        sc.close();
    }
}
