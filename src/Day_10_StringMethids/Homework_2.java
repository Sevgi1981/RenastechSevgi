package Day_10_StringMethids;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework_2 {

    public static void main(String[] args) {

        // Write a code where user is asked to enter a number and check for every number between 0 to that number
        // to see how many number between 0 to that number can be divided to 3 and 5 and sum all those number, Print the result

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        int a = scan.nextInt();
        int b = 0;

        for (int i = 0; i <= a; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                b = b + i;
                System.out.print("," + i);
            }
        }
        System.out.println("  Total  of the these numbers: " + b);
    }
}
