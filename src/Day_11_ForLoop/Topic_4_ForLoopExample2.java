package Day_11_ForLoop;

import java.util.Scanner;

public class Topic_4_ForLoopExample2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Scanner from the user input
        System.out.println("Please enter a String");
        String FromScan = scan.next();

        for (int i = 0; i < FromScan.length(); i++) {

            if (FromScan.charAt(i) == 'A' || FromScan.charAt(i) == 'a') {  // if the String contains A, then make all to upper Case
            FromScan = FromScan.toUpperCase();
                System.out.println(FromScan);

            } else {
            FromScan = FromScan.toLowerCase(); // make it lower case
                System.out.println(FromScan);  // print Lower
            }
        }

        System.out.println(FromScan); // the last value of the FromScan.
        // The last char is deciding the last value of FromScan to be either upper or lower case,



    }

}
