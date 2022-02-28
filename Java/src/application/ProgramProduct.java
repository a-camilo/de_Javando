package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

//          Constrturor
//        System.out.print("Quantity in Stock: ");
//        int quantity = sc.nextInt();
//        Product product = new Product(name,price,quantity);
        Product product = new Product(name,price);

        product.setName("Computer");
        System.out.println("Updated name: "+product.getName());

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter of number of products to be add in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();

        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter of number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();

        System.out.println("Remove data: " + product);
        System.out.println();

        sc.close();
    }
}
