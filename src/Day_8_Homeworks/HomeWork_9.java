package Day_8_Homeworks;

import java.util.Scanner;

public class HomeWork_9 {
    public static void main(String[] args) {

        //Question:
        // Ask user to enter a number by using scanner
        // if number is divided by 5 and 3 print FinRa
        // if number is divided by 3 print Fin
        //if number is divided by 5 print RA

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scan.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FinRa");
            ;
        } else if (number % 3 == 0) {
            System.out.println("Fin");

        } else if (number % 5 == 0) {
            System.out.println("RA");
        }
    }
}

