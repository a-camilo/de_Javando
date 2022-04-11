package application;

import entitites.Product;
import utils.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.0));
        list.add(new Product("Tablet",450.0));
        list.add(new Product("Mouse",25.0));
        list.add(new Product("HD Case",80.90));
        list.add(new Product("Case",200.0));

        System.out.print("Enter minor value: ");
        double min = sc.nextDouble();

        list.removeIf(p -> p.getPrice() >= min);

        for (Product p:list) {
            System.out.println(p);
        }
        sc.close();
    }
}
