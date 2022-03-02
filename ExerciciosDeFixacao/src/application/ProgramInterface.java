package application;

import enttities.Contract;
import enttities.Installments;
import services.ContractServices;
import services.OnlinePaymentService;
import services.PayPalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramInterface {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

        ContractServices cs = new ContractServices(new PayPalService());
        cs.processContract(contract,n);
        
        System.out.println("Installments:");
        for (Installments it:contract.getInstallments()) {
            System.out.println(it);
        }
        sc.close();
    }
}
