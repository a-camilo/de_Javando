package application;

import entities.ImportedProduct;
import entities.Product3;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct3 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product3> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter  the number of products: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            } else {

                list.add(new Product3(name, price));
            }
        }

        System.out.println("Price Tags:");
        for (Product3 prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
