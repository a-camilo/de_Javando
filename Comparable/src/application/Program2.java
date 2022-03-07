package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

    public static void main(String[] args) {
        String path = "Comparable/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String text = br.readLine();
            while (text != null) {
                System.out.println(text);
                text = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
