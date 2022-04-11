package application;

import entitites.Product;
import utils.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program4 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.0));
        list.add(new Product("Tablet",450.0));
        list.add(new Product("Mouse",25.50));
        list.add(new Product("Radio",99.41));


        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);
    }
}
