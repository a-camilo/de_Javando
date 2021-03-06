package application;

import utils.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollar will be bought? ");
        double bought = sc.nextDouble();

        double c = CurrencyConverter.dollarprice(price,bought);

        System.out.printf("Amount to be paid in reais: %.2f",c);
        sc.close();
    }
}
