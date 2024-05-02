package task9;

import java.util.Scanner;

public class Sample6 {

    public static void main(String[] args) {

        double amount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of the Month : ");
        int month = sc.nextInt();
        System.out.println("Enter the Rent per Day : ");
        double rent = sc.nextDouble();
        System.out.println("Enter the Number of Days Stayed in Hotel : ");
        int days = sc.nextInt();

        switch (month) {
            case 1, 2, 3, 7, 8, 9, 10:
                amount = rent * days;
            break;

            case 4, 5, 6, 11, 12:
                rent = rent + (rent * 0.20);
                amount = rent * days;
            break;
        }
        System.out.println(amount);
    }
}
