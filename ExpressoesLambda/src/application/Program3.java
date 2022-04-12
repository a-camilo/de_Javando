package application;

import entitites.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.0));
        list.add(new Product("Tablet",450.0));
        list.add(new Product("Mouse",25.0));
        list.add(new Product("HD Case",80.90));
        list.add(new Product("Case",200.0));

        list.forEach(Product::nonStaticPriceUpdate);
        list.forEach(System.out::println);
    }
}
