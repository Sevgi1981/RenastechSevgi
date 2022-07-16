package Day_10_StringMethids;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework_1 {

   // Write a code where user is asked to enter an integer number:
     //       1) Using the given number find the factorial of that number and Print the result.
    // example: 5 ==> 5! = 5*4*3*2*1 = 120

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter a number");

        int a=scan.nextInt();
        int factorialValue=1;

        for (int i = 1; i <= a; i++) {
            System.out.print(+i+" * ");
            factorialValue=factorialValue*i;
        }


        System.out.println("\nfactorialValue = " + factorialValue);

    }
}
