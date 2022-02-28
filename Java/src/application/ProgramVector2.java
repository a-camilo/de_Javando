package application;

import entities.ProductVect;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVector2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductVect[] vect = new ProductVect[n];
        for (int i = 0; i < vect.length; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVect(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("Avarage Price: %.2f", avg);
        sc.close();
    }


}
