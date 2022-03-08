package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> vote = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = sc.next();


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int voteNumber = Integer.parseInt(fields[1]);

                if (vote.containsKey(name)){
                    int voteSofar = vote.get(name);
                    vote.put(name, voteNumber + voteSofar);
                }
                else {
                    vote.put(name,voteNumber);
                }
                line = br.readLine();
            }
            for (String key:vote.keySet()) {
                System.out.println(key + ": " + vote.get(key));
            }
        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }

        sc.close();
    }
}
