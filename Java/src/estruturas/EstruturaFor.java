package estruturas;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int soma = 0;
//        for (int i = 0; i < N; i++){
//            int x = sc.nextInt();
//            soma = soma + x;
//        }
//        System.out.println(soma);
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Aperte a tecla o número Zero e o  Enter para iniciar: ");
//        char x = sc.next().charAt(0);
//        while (x != 'n') {
//            System.out.print("Qual tabuada deseja saber? ");
//            int N = sc.nextInt();
//            for (int i = N; i <= N; i++) {
//                for (int j = 0; j <= 10; j++) {
//                    int vezes = i * j;
//                    System.out.println(i + "X" + j + " = " + vezes);
//                }
//            }
//            System.out.print("Deseja saber outra tabuada (s/n)? ");
//            x = sc.next().charAt(0);
//
//        }
//
//        sc.close();
//      Exreícios For

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
