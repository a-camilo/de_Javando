package estruturas;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Me passa 1 dollar");
//        int x = sc.nextInt();
//        int dollar = 0;
//
//        while (x != 0){
//            dollar += x;
//            x= sc.nextInt();
//        }
//        System.out.println(dollar);
//
//        sc.close();

        //****Exercícios While 1
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Insira a senha: ");
//        int senha = sc.nextInt();
//        while (senha != 2002){
//            System.out.println("*** Senha Inválida! ***");
//            System.out.print("Insira a senha: ");
//            senha = sc.nextInt();
//        }
//        System.out.println(" ,-) Acesso Permitido ;-) ");
//        sc.close();

        //****Exercícios While 2

//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        while (x != 0 && y != 0) {
//            if (x > 0 && y > 0) {
//                System.out.print("primeiro");
//            } else if (x < 0 && y > 0) {
//                System.out.print("segundo");
//            } else if (x < 0 && y < 0) {
//                System.out.print("terceiro");
//            } else {
//                System.out.print("quarto");
//            }
//            x = sc.nextInt();
//            y = sc.nextInt();
//        }

//        sc.close();

        //****Exercícios While 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tipo de combustível mais utiliza? ");

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int cod = 0;
        while (cod != 4) {

            if (cod == 1) {
                gasolina += 1;

            } else if (cod == 2) {
                alcool += 1;

            } else if (cod == 3) {
                diesel += 1;
            }
            cod = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println(gasolina + " Gasolina");
        System.out.println(alcool + " Alcool");
        System.out.println(diesel + " Diesel");

        sc.close();
    }
}
