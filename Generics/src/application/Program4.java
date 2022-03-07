package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program4 {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(2.0,3.0,4.0);
        List<Object> myObjects = new ArrayList<>();

        copy(myInts,myObjects);
        printList(myObjects);
        copy(myDoubles,myObjects);
        printList(myObjects);
    }
    public static void copy(List<? extends  Number> source, List<? super Number> destiny){
        destiny.addAll(source);
    }
    public static void printList(List<?> list){
        for (Object obj:list) {
            System.out.print    (obj + " ");
        }
        System.out.println();
    }
}
