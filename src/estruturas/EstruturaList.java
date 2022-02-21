package estruturas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstruturaList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        System.out.println(list.size());

        System.out.println("-------------");
        for (String lista : list) {
            System.out.println(lista);
        }
        System.out.println("-------------");
        list.removeIf(lista -> lista.charAt(0) == 'M');
        for (String lista : list) {
            System.out.println(lista);
        }
        System.out.println("----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        List<String> result = list.stream().filter(lista -> lista.charAt(0) == 'A').toList();
        for (String lista : result) {
            System.out.println(lista);
        }
        System.out.println("----------------------");
        String name = list.stream().filter(lista -> lista.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
