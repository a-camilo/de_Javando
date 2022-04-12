package application;

import entitites.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program4 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("Radio", 80.90));

        double factor = 1.1;
        Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * factor);
        list.forEach(consumer);
        list.forEach(System.out::println);
    }
}
