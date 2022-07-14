package Day_8_Scanners;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter First Number");

        int num1=scan.nextInt();

        System.out.println("Enter Second Number");

        int num2=scan.nextInt();

        if (num1>num2){
            System.out.println(+num1+ " is max number between " +num1+ " and " +num2);
        } else {
            System.out.println(+num2+ " is max number between " +num1+ " and " +num2);
        }


    }
}
