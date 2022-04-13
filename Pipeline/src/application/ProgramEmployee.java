package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class ProgramEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path:");
        String path = sc.next();
        System.out.print("Enter Salary: ");
        Double salary = sc.nextDouble();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> email = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();
            System.out.println("Email of people whose salary is more " + String.format("%.2f", salary) + ":");
            email.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) =='M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
            System.out.println("Sum of salary from people whose starts with 'M': " + String.format("%.2f",sum));


        } catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }

        sc.close();
    }
}
