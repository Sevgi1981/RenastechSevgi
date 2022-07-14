package Day_7_Switch_Scanner;

import java.util.Scanner;

public class Topic6_Scanners {
    public static void main(String[] args) {

        // reads the console - input the end user, scan document,
        // input the outside that is not in coding
        // information comes from users or other resource not inside the core
        // scanner has always a library that already there. what type of data we are going to read them

        // scanner is a library
        // this library has ready methods that you can use it
        // to be able to use library you need call them
        // and create an object from library

        //we have scanner object calls input

        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number : ");
        byte byteNumber = sc.nextByte();                      // it needs to tell what type of data you write
        System.out.println("enter a number : "+ byteNumber);  // it reads the next number and create a new line



    }
}
