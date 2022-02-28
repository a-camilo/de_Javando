package estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int r;
//        String s1, s2, s3;
//
//        r = sc.nextInt();
//        sc.nextLine();
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//
//        System.out.println("DADOS DIGITADOS:");
//
//        System.out.println(r);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//
//        sc.close();
//
//        double x = 3.0;
//        double y = 4.0;
//        double z = -5.0;
//        double A, B, C;
//
//        A = Math.sqrt(x);
//        B = Math.sqrt(y);
//        C = Math.sqrt(25.0);
//
//        System.out.println("Raiz quadrada de " + x + "=" + A);
//        System.out.println("Raiz quadrada de " + y + "=" + B);
//        System.out.println("Raiz quadrada de " + 25.0 + "=" + C);
//
//        A = Math.pow(x, y);
//        B = Math.pow(x, 2.0);
//        C = Math.pow(5.0, 2.0);
//
//        System.out.println(x + " elevado a" + y + " = " + A);
//        System.out.println(x + " elevado ao quadrado = " + B);
//        System.out.println("5 elevado ao quadrado " + C);
//
//        A = Math.abs(y);
//        B = Math.abs(z);
//
//        System.out.println("O valor absoluto de " + y + " = " + A);
//        System.out.println("O valor absoluto de " + z + " = " + B);

//        int a,b, soma;
//        a = 10;
//        b = 30;
//
//        soma = a + b;
//        System.out.println(soma);
//
//        a = -30;
//        b = 10;
//
//        soma = a+b;
//        System.out.println(soma);
//
//        a = 0;
//        b = 0;
//        soma = a + b;
//        System.out.println(soma);

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double A,R, pi = 3.14159;
//        R = sc.nextDouble();
//        A = pi * R *R;
//
//        System.out.printf("A=%.4f%n",A);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int A, B, C, D;
//
//        A = sc.nextInt();
//        B = sc.nextInt();
//        C = sc.nextInt();
//        D = sc.nextInt();
//
//        int DIFERENCA = (A * B -C * D);
//
//        System.out.println("DIFERENÇA = "+ DIFERENCA);

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int numero, horasT;
//        double salary;
//
//        numero = sc.nextInt();
//        horasT = sc.nextInt();
//        salary = sc.nextDouble();
//
//        double calc = horasT * salary;
//        System.out.printf("Number = %d %nSalary U$ = %.2f",numero ,calc);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int codPeca1, numeroPeca1;
//        int codPeca2, numeroPeca2;
//        double valorUnit1, valorUnit2;
//
//        codPeca1 = sc.nextInt();
//        numeroPeca1 = sc.nextInt();
//        valorUnit1 = sc.nextDouble();
//
//        codPeca2 = sc.nextInt();
//        numeroPeca2 = sc.nextInt();
//        valorUnit2 = sc.nextDouble();
//
//        double valorAPagar = numeroPeca1 * valorUnit1 + numeroPeca2 * valorUnit2;
//        System.out.printf("Valor a pagar R$ %.2f", valorAPagar);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double A, B, C;
//        double AreaTriangulo, AreaCirculo, AreaTrapezio, AreaQuadrado, AreaRetangulo;
//
//        A = sc.nextDouble();
//        B = sc.nextDouble();
//        C = sc.nextDouble();
//
//        AreaTriangulo = A * C / 2.0;
//        AreaCirculo = 3.14159 * C * C;
//        AreaTrapezio = (A + B) / 2.0 * C;
//        AreaQuadrado = B * B;
//        AreaRetangulo = A * B;
//
//
//        System.out.printf("TRIANGULO: %.3f%n", AreaTriangulo);
//        System.out.printf("CIRCULO: %.3f%n", AreaCirculo);
//        System.out.printf("TRAPEZIO: %.3f%n", AreaTrapezio);
//        System.out.printf("QUADRADO: %.3f%n", AreaQuadrado);
//        System.out.printf("RETANGULO: %.3f%n", AreaRetangulo);
//        sc.close();
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int hora;
//
//        System.out.println("Quantas horas?");
//        hora = sc.nextByte();
//        if (hora < 12) {
//            System.out.println("Bom dia!");
//        } else if (hora < 18) {
//            System.out.println("Boa tarde!");
//
//        } else {
//            System.out.println("Boa noite!");
//        }
//
//        sc.close();
//
//       c

//        int numero;
//        numero = sc.nextInt();
//
//        if (numero < 0){
//            System.out.println("Negativo");
//        }else{
//            System.out.println("Não negativo");
//        }
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int numero = sc.nextInt();
//
//        if(numero % 2 == 0){
//            System.out.println("PAR");
//        }else {
//            System.out.println("IMPAR");
//        }
//
//        sc.close();
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int A,B;
//        A = sc.nextInt();
//        B = sc.nextInt();
//        if (A % B == 0 || B % A == 0) {
//            System.out.println("São Multiplos");
//        }else {
//            System.out.println("Não são Multiplos");
//        }
//        sc.close();
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int horaInicial = sc.nextInt();
//        int horaFinal = sc.nextInt();
//
//        int totalHora;
//        if (horaInicial < horaFinal){
//            totalHora = horaFinal - horaInicial;
//        }else{
//            totalHora = 24 - horaInicial + horaFinal;
//        }
//        System.out.println("O jogo durou "+ totalHora + " horas(s)");
//        sc.close();
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int cod,qtd;
//        cod = sc.nextInt();
//        qtd = sc.nextInt();
//
//        double total;
//
//        if (cod ==  1){
//            total = qtd * 4.0;
//        }else if (cod == 2){
//            total = qtd * 4.5;
//        }else if (cod == 3){
//            total = qtd * 5.0;
//        }else if (cod == 4){
//            total = qtd * 2.0;
//        }else {
//            total = qtd * 1.5;
//        }
//        System.out.println("Total: "+total);
//
//        sc.close();


//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int minutos = sc.nextInt();
//
//        double conta = 50.0;
//        if (minutos > 100) {
//            conta = conta + (minutos - 100) * 2.0;
//        }
//        System.out.printf("Valor da Conta = R$ %.2f%n",conta);
//        sc.close();
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        String dia;
//
//        if (x == 1) {
//            dia = "Domingo";
//        } else if (x == 2) {
//            dia = "Segunda";
//        } else if (x == 3) {
//            dia = "Terça";
//        } else if (x == 4) {
//            dia = "Quarta";
//        } else if (x == 5) {
//            dia = "Quinta";
//        } else if (x == 6) {
//            dia = "Sexta";
//        } else if (x == 7) {
//            dia = "Sábado";
//        } else {
//            dia = "Valor inválido";
//        }
//        System.out.print("Dia da semama: "+dia);
//        sc.close();
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        String dia;
//        String frase = null;
//
//        switch (x) {
//            case 1:
//                dia = "Domingo";
//                frase = ", que ressaca, nunca mais faço isso";
//                break;
//            case 2:
//                dia = "Segunda";
//                frase = ", vai trabalhar vagabundo!";
//                break;
//            case  3:
//                dia ="Terça";
//                frase = ", semana Longa";
//                break;
//            case 4:
//                dia ="Quarta";
//                frase = ", dia da feijuca!!";
//                break;
//            case 5:
//                dia = "Quinta";
//                frase =", bora tomar uma?";
//                break;
//            case 6:
//                dia ="Sexta";
//                frase = ", sextou!!! Bora encher a cara?";
//                break;
//            case 7:
//                dia ="Sábado";
//                frase = ", bora dar um perdido";
//                break;
//            default:
//                dia = "Valor Inválido";
//                frase = "";
//
//
//        }
//        System.out.println("Dia da semana: " + dia.concat(frase) );
//
//        sc.close();
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double preco = sc.nextDouble();
//        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
//        System.out.printf("Desconto R$ %.2f%n",desconto);
//
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double largura = sc.nextDouble();
//        double comprimento = sc.nextDouble();
//        double metroQuadrado = sc.nextDouble();
//
//        double area = largura * comprimento;
//        double preco = area * metroQuadrado;
//
//        System.out.printf("AREA = %.2f%n",area);
//            System.out.printf("PREÇO = R$%.2f%n" ,preco);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);;
//        int x = sc.nextInt();
//        int soma = 0;
//        while (x != 0){
//            soma += x;
//            x = sc.nextInt();
//        }
//        System.out.println("Soma " + soma);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int senha = sc.nextInt();
//        while (senha != 2002) {
//            System.out.println("Senha inválida ");
//            senha = sc.nextInt();
//        }
//        System.out.println("Acesso Permitido");
//        sc.close();
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int x, y;
//        x = sc.nextInt();
//        y = sc.nextInt();
//        while (x != 0 && y != 0) {
//            if (x > 0 && y > 0) {
//                System.out.println("Primeiro");
//            } else if (x < 0 && y > 0) {
//                System.out.println("Segundo");
//            } else if (x < 0 && y < 0) {
//                System.out.println("Terceiro");
//            } else {
//                System.out.println("Quarto");
//            }
//            x = sc.nextInt();
//            y = sc.nextInt();
//        }
//
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int alcool = 0;
//        int gasolina = 0;
//        int diesel = 0;
//
//        int tipo = sc.nextInt();
//
//        while (tipo != 4) {
//            if (tipo == 1) {
//                alcool = alcool + 1;
//            } else if (tipo == 2) {
//                gasolina = gasolina + 1;
//            } else if (tipo == 3) {
//                diesel = diesel + 1;
//            }
//            tipo = sc.nextInt();
//        }
//        System.out.println("Muito Obrigado");
//        System.out.println("Alcool " + alcool);
//        System.out.println("Gasolina " + gasolina);
//        System.out.println("Diesel " + diesel);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int soma = 0;
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            soma = soma + x;
//        }
//        System.out.println(soma);
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        for (int i = 1; i <= x; i = i +2) {
//
//            System.out.println(i);
//        }
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int in = 0;
//        int out = 0;
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            if (x >= 10 && x <= 20) {
//                in = in + 1;
//            } else {
//                out = out + 1;
//            }
//        }
//        System.out.println(in + " in");
//        System.out.println(out + " out");
//        sc.close();

//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        char resp;
//        do {
//            System.out.print("Digite a temperatura em Celsius: ");
//            double C = sc.nextDouble();
//            double F = 9.0 * C / 5.0 + 32;
//            System.out.printf("%.1f%n", F);
//            System.out.print("Deseja repetir (s/n)? ");
//            resp = sc.next().charAt(0);
//        }while (resp != 'n');
//
//        sc.close();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1 & n2);
            System.out.println(n1 | n2);
            System.out.println(n1 ^ n2);
            System.out.println("Continue (s/n)? ");
            resp = sc.next().charAt(0);
        }while (resp != 'n');






        sc.close();

    }

}
