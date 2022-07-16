package Day_10_StringMethids;

import java.util.Scanner;

public class Homework_3 {

    public static void main(String[] args) {

        //Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        int a = scan.nextInt();

        int sumeven = 0;
        int sumodd = 0;

        for (int i = 0; i <= a; i++) {

            if (i % 2 == 0) {
                System.out.print(" " + i);
                sumeven=sumeven+i;

            }  else {
                System.out.print(" " + i);
                sumodd=sumodd+i;

            }


        }

        System.out.println("\n" + "Sum of even numbers: " + sumeven);
        System.out.println("\n" + "Sum of odd numbers: " + sumodd);


       // for (int i = 0; i <= a; i++) {

         //   if (i % 2 != 0) {
            //    System.out.print(" " + i);
           //     sumodd=sumodd+i;

          //  }

       // }
       // System.out.println("\n" + "Sum of odd numbers: " + sumodd);

        //boolean even;
        //boolean odd;
       // int sumeven = 0;
      //  int sumodd = 0;

      //  for (int i = 0; i <= a; i++) {

        //    System.out.print("+" + i);
       //     if (i % 2 == 0) {

        //        sumeven = sumeven + i;
        //        System.out.println("sum of even number = " + sumeven);
        //    } else if (i % 2 != 0){
        //        sumodd=sumodd + i;

        //        System.out.println("sum of odd number = " + sumodd);
        //    }


            //System.out.println("= " + sumeven);

            //System.out.println("=*************");
            //int sumvalue = 0;

            //for (int j = 0; j <= b; j += 3) {
               // System.out.println(+j);


               // sumvalue = sumvalue + j;


            //}

            //System.out.println(count+ " number between 0 to " +a+ " can be divided to 3 and 5");
            //System.out.println("sum of these numbers = " + sumvalue);

        }


    }



