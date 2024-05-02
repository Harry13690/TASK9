package task9;

import java.util.Scanner;

public class Sample4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input : ");
        int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println();
                for (int j = 0; j < n; j++) {
                    if (i == j || (i + j == n - 1)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }