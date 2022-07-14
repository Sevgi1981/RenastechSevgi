package Day_8_Scanners;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a number");
        int number=scan.nextInt();

        if (number>0){
            System.out.println(number+ " is a positive number");
        } else if (number<0) {
            System.out.println(number+ " is a negative number");
        } else if (number==0){
            System.out.println( "The number is equal zero");
        }

    }
}
