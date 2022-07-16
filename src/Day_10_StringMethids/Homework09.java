package Day_10_StringMethids;

import java.util.Scanner;

public class Homework09 {

    //Task : Write a program that checks if a String is a Palindrome.
    //         *
    //         * Example: input : Java , output: java is not  palindrome
    //         * Example: input : kayak , output : kayak is a palindrome
    //         * Example: input level , ouput : level is a palindrome
    //         *
    //         * tip: A palindrome is a word, number, phrase, or other sequence of characters
    //         * which reads the same backward as forward, such as madam or racecar.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word to see if it is a palindrome or not");

        String pol = scan.next();

        String reverse1="";
        String reverse2="";

        for (int i = 0; i < pol.length(); i++) {
            reverse1 =  (reverse1 + pol.charAt(+i));

        }
        System.out.println(reverse1);

        for (int j = pol.length() - 1; j >= 0; j--) {
            reverse2 =  (reverse2 + pol.charAt(+j));

        }

        System.out.println(reverse2);

        if (reverse1.equals(reverse2) ) {
            System.out.println(pol + " is a palindrome");


        } else {
            System.out.println(pol + " is not a palindrome");
        }


    }
}
