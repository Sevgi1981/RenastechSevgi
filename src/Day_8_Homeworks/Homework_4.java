package Day_8_Homeworks;

import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {

        //Use the Topic4_ScannerExample class (the one I did in the class) as base,
        //write the same code by using if else statements instead of switch and case statement
        // "1) Select 1 for Multiplication \n2) Select 2 for Division \n3) Select 3 for Addition\n4) Select 4 for Subtraction"

        Scanner scan= new Scanner(System.in);

        System.out.println("Please Enter the first Number");
        double num1= scan.nextDouble();

        System.out.println("Please Enter the second Number");
        double num2= scan.nextDouble();

        System.out.println("1) Select 1 for Multiplication \n2) Select 2 for Division \n3) Select 3 for Addition\n4) Select 4 for Subtraction");
        double num3= scan.nextDouble();

        if (num3==1) {
            System.out.println("The Multiplication result is : " +num1*num2);
        } else if (num3==2) {
            System.out.println("The Division result is : " +num1/num2);
        } else if (num3==3) {
            System.out.println("The Addition result is : " +num1+num2);
        } else if (num3==4) {
            System.out.println("The Subtraction result is : " +(num1-num2));
        } else {
            System.out.println(num3+ " is not one of these number");
        }

    }
}
