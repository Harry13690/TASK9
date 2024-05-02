package task9;

import java.util.Scanner;

public class Sample7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First(X) Number : ");
        int x = sc.nextInt();
        System.out.println("Enter the Second(Y) Number : ");
        int y = sc.nextInt();
        System.out.println("Enter the Third(Z) Number : ");
        int z = sc.nextInt();

        if (x > y && x > z){
            System.out.println("X is the Largest Number");
        }
        else if (y > x && y > z) {
            System.out.println("Y is the Largest Number");
        }
        else if (z > x && z > y) {
            System.out.println("Z is the Largest Number");
        }
        else if (x == y && x == z) {
            System.out.println("All the The Number are Same");
        }
        else if (x == y) {
            System.out.println("X and Y are the Largest Number");
        }
        else if (y == z) {
            System.out.println("Y and Z are the Largest Number");
        }
        else if (z == x) {
            System.out.println("Z and X are the Largest Number");
        }
    }
}
