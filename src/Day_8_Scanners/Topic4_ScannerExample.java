package Day_8_Scanners;

import java.util.Scanner;

public class Topic4_ScannerExample {
    public static void main(String[] args) {

        // Lets create a Calculator
        // Lets ask user to enter first number
        // then ask user to put second number
        // Select the operation

        Scanner cal= new Scanner(System.in);

        System.out.println("WELCOME TO CALCULATOR");
        System.out.println("Please Enter the first Number");
        double firstNumber= cal.nextInt();

        System.out.println("Please Enter the second Number");
        double secondNumber= cal.nextInt();

        System.out.println("1) Select 1 for Multiplication \n2) Select 2 for Division \n3) Select 3 for Addition\n4) Select 4 for Subtraction");
        int operation = cal.nextInt();

        switch (operation){

            case 1:
               double result = firstNumber*secondNumber;
                System.out.println("The result is: "+result);
                break;
            case 2:
                double result2 = firstNumber/secondNumber;
                System.out.println("The result is: "+result2);
                break;
            case 3:
                double result3 = firstNumber+secondNumber;
                System.out.println("The result is: "+result3);
                break;
            case 4:
                double result4 = firstNumber-secondNumber;
                System.out.println("The result is: "+result4);
                break;
            default:
                System.out.println("The Operation is not valid");


        }

    }
}
