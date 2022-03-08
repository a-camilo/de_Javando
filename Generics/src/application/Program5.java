package application;

import entities.Client;

public class Program5 {
    public static void main(String[] args) {
        Client c1 = new Client("Antonio","antonio@email.com");
        Client c2 = new Client("Antonio","antonio@email.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
