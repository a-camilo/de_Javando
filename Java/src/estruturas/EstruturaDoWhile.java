package estruturas;

import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char repetir;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Equivalente a Fahrenheit: %.1f%n",f);
            System.out.print("Deseja repetir(S/N)? ");
            repetir = sc.next().charAt(0);


        } while (repetir != 'n');


        sc.close();
    }
}
