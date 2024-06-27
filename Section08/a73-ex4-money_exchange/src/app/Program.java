package app;

import entities.CurrencyCoverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyCoverter cc = new CurrencyCoverter();

        System.out.print("What is the currency: ");
        String currency = sc.nextLine();
        System.out.print("What is the currency price: ");
        double currencyPrice = sc.nextDouble();
        System.out.print("How many "+ currency + " will be bought? ");
        double bought = sc.nextDouble();
        double totalBought = cc.totalConvert(currencyPrice, bought);

        System.out.printf("Amount to be paid in %s = %.2f%n", currency, cc.applyTax(totalBought));






        sc.close();
    }
}
