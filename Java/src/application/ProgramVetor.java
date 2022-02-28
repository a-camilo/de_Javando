package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Input:");
        int N = sc.nextInt();
        double [] vect = new double[N];
        for (int i = 0; i< N; i++){
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;

        for (int i = 0; i<N;i++){
            sum += vect[i];
        }
        double avg = sum/N;
        System.out.printf("Avarage height: %.2f",avg);
        sc.close();
    }
}
