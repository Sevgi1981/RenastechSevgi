package Day_8_Scanners;

import java.util.Scanner;

public class Topic3_nextLine {
    public static void main(String[] args) {

        // 2) nextLine() this will read everything on the line and assign it to String:

        Scanner info = new Scanner(System.in);

        System.out.println("Please Enter Your Full Name: ");
        String name = info.nextLine();
        System.out.println("The Full name is: " +name);





    }
}
