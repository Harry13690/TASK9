package task9;

import java.util.Scanner;

public class Sample1 {

    public static void main(String[] args) {

        String reverse = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();

        for (int i = s.length() - 1; i >= 0; i--) {
            char sh = s.charAt(i);
            reverse = reverse + sh;
        }

        if (reverse.equals(s)) {
            System.out.println("The Given Number is Palindrome");
        }
        else {
            System.out.println("The Given Number is not a Palindrome");
        }
    }
}


