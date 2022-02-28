package application;

import entities.Imposto;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramImpostoDeRenda {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Imposto> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or Company (I/C)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Imposto imposto : list) {
            System.out.println(imposto.getNome() + ": $ " + String.format("%.2f",imposto.tax()));
        }
        System.out.println();
        double sum = 0.0;
        for (Imposto imposto : list) {
            sum += imposto.tax();
        }

        System.out.println("TOTAL TAX PAYER: $ " + String.format("%.2f",sum));
        sc.close();
    }
}
