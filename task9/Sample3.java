package task9;

import java.util.Scanner;

public class Sample3 {

    public static void main(String[] args) {

        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input : ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
