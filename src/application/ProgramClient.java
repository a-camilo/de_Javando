package application;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product2;
import entities.enums.OrderStatus2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramClient {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name,email,birthDate);

        System.out.println("Enter other data:");
        System.out.print("Status: ");
        OrderStatus2  status = OrderStatus2.valueOf(sc.next());

        Order2 order2 =new Order2(new Date(),status,client);

        System.out.print("How many items to this order: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product2 product2 = new Product2(productName,productPrice);
            OrderItem it = new OrderItem(quantity,productPrice,product2);
            order2.addItem(it);

        }

        System.out.println("Order Summary");
        System.out.println(order2);




        sc.close();
    }
}
