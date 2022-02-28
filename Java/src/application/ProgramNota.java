package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNota {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Entrada:");
        System.out.println("Nome do aluno: ");
        student.name = sc.next();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.println("Saída:");
        System.out.printf("Final Grade = %.2f%n", student.notaTrimestral());
        if (student.notaTrimestral() >= 60) {
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n ", student.missingPoints());
        }


        sc.close();
    }
}
