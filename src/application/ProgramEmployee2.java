package application;

import entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee2 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee2> list = new ArrayList<>();
        System.out.print("How many employees wil be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee2 emp = new Employee2(id,name,salary);
            list.add(emp);
        }
        System.out.print("Enter the employee id  that will have salary increased: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list,idSalary);
        if (pos == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }


        System.out.println("List of Employees: ");
        for (Employee2 emp:list) {
            System.out.println(emp);
        }

        sc.close();
    }
    public static Integer position(List<Employee2> list, int id){
        for (int i= 0; i<list.size();i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }

        return null;
    }
}
