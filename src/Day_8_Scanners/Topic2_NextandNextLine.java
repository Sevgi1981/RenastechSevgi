package Day_8_Scanners;

import java.util.Scanner;

public class Topic2_NextandNextLine {

    // the Strings have 2 ways to be scanned
    // 1) next() Code will read all the inputs that can be number or chars, or anything you put in the console until it sees a space " ";
    // 2) nextLine ()

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);

        System.out.println("put something on the console");
        String fruit= st.nextLine(); // whatever you write in here it will print in there
        System.out.println("the thing you put is : " +fruit);

        System.out.println("put something on the console");
        String vegie= st.nextLine(); // whatever you write in here it will print in there
        System.out.println("the thing you put is : " +vegie);







    }
}
