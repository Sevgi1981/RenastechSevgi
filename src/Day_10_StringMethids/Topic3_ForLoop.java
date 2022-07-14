package Day_10_StringMethids;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Topic3_ForLoop {

    public static void main(String[] args) {

        // loops will help you on continues actions
        // in the loop you will always need to specify
        // starting point
        // ending point
        // iteration

        //for ( starting ; endpoint ; iteration)
        for (int i = 0; i < 20; i++) {
            System.out.println("increase:" +i);
        }

        System.out.println("****************");

        for (int j = 10; j >= 0; j--) {
            System.out.println("decrease:" +j);
        }

        System.out.println("****************");
        for (int i = 0; i < 20; i+=2) {
            System.out.println("increase:" +i);
        }

        // if you have array
        int [] grades = {98, 100, 83, 90, 93} ;
        for (int i=0; i< grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("*-------------*");
        // if we want like this pattern we need to change inside second FOR = j<5 to j<i
        //*
        //**
        //***
        //****
        //if we change i=0 to i=1 it wont print space
        //if we change i<5 toi>=5 it will print 5 star
        //NestedLoopsPattern



        for (int i = 1; i <= 5; i++) {  // rows
            for (int j = 0; j < i; j++) {  // colons
                System.out.print("*"); // new line print all * (alt alta) // if we remove ln and new sout it will be 5 colon and 5 star

            }
            System.out.println();
        }
        for (int i = 4; i >0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
        }
            System.out.println();


        }

        System.out.println("How many stars would you like?");
        Scanner scan=new Scanner(System.in);
        int numOfStar=scan.nextInt();


        for (int i = 1; i <= numOfStar; i++) {  // rows
            for (int j = 0; j < i; j++) {  // colons
                System.out.print("*"); // new line print all * (alt alta) // if we remove ln and new sout it will be 5 colon and 5 star

            }
            System.out.println();
        }
        for (int i = numOfStar-1; i >0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();


        }

    }



}
