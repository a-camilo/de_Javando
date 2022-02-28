package application;

import entities.AccountBank;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AccountBank accountBank;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (S/N)? ");
        char s = sc.next().charAt(0);
        if (s != 'n'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            accountBank = new AccountBank(number,holder,initialDeposit);
        }else {
            accountBank = new AccountBank(number,holder);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println();
        System.out.println(accountBank);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        accountBank.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(accountBank);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        accountBank.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(accountBank);

        sc.close();
    }
}
