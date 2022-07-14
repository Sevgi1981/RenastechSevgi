package Day_8_Homeworks;

import java.util.Scanner;

public class Homework_5 {

    //Write a program where User is being asked to enter the first name,
    //and last name and print the full name on the console based on given information.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter Your First and Last Name");
        String name= scan.nextLine();

        System.out.println("Your Full Name is :" +name);

    }
}
