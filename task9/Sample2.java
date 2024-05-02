package task9;

import java.util.Scanner;

public class Sample2 {

    public static void main(String[] args) {

        String reverse ="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word :");
        String x = s.nextLine();

        for (int i = x.length() - 1; i >= 0; i--) {
            char ch = x.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}
