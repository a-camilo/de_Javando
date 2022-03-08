package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program6 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

//        set.remove("Tablet");
//        set.removeIf( X -> X.length() >= 3);
        set.removeIf( X -> X.charAt(0) =='T');

        for (String p: set){
            System.out.println(p);
        }
    }
}
