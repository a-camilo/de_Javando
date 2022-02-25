package application;

import entities.RentRoom;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class ProgramRentRoom {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int room = sc.nextInt();
        RentRoom[] vect = new RentRoom[10];

        for (int i = 1; i <= room; i++) {
            System.out.println("Rent: #" + i);
            System.out.print("Name: ");
            sc.next();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ") ;
            int roomNumber = sc.nextInt();
            vect[roomNumber] = new RentRoom(name, email, roomNumber);
            System.out.println();
        }
        System.out.println("Busy rooms: ");

        for (int i = 1; i < 10; i++) {
            if (vect[i] != null) {

//                System.out.println(i + 1 + ": " + vect[i]);
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
