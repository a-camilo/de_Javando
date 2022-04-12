package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Program3 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.00));
        list.add(new Product("HD Case",80.90));

        Function<Product,String> function = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(function).toList();
        names.forEach(System.out::println);
    }
}
