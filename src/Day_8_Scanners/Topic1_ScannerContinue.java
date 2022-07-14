package Day_8_Scanners;

import java.util.Scanner;

public class Topic1_ScannerContinue {
    public static void main(String[] args) {

        // we are creating a Scanner Object
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the short number");
        //How to scan the Short Data Type input
        short sh = input.nextShort();

        System.out.println("the number that user entered is : " +sh);

        // next integer number entered by users
        System.out.println("Please enter the int number");
        int In = input.nextInt();

        System.out.println("The integer number is : " +In);

        // next double number entered by users
        System.out.println("Please enter the double number");
        double Do= input.nextDouble();
        System.out.println("The double number is : " +Do);


        //next float number;
        float fl= input.nextFloat();
        System.out.println("The float number is: "+fl);

        // the Strings have 2 ways to be scanned
        // 1) next() Code will read all the inputs that can be number or chars, or anything you put in the console until it sees a space " ";
        // 2) nextLine ()

        // String name = "20";  // this is not a number this a text.







    }
}
