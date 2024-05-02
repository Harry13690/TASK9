package task9;

import java.util.Scanner;

public class Sample5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mark :");
        int x = sc.nextInt();

        if (x == 100){
            System.out.println("Your Grade is 'S'");
        }
        else if (x <= 99 && x >= 90) {
            System.out.println("Your Grade is 'A'");
        }
        else if (x <= 89 && x >= 80) {
            System.out.println("Your Grade is 'B'");
        }
        else if (x <= 79 && x >= 70) {
            System.out.println("Your Grade is 'C'");
        }
        else if (x <= 69 && x >= 60) {
            System.out.println("Your Grade is 'D'");
        }
        else if (x <= 59 && x >= 50) {
            System.out.println("Your Grade is 'E'");
        }
        else if (x > 100) {
            System.out.println("Invalid Output");
        }
        else {
            System.out.println("Your Grade is 'F'");
        }
    }
}
