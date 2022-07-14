package Day_9_Strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Homework_String {

    /*
    Write a code where user is asked to enter a Name,
    if the name start with “A” and ends with “L”,  Replace “A” with “B”and print the result
    If Name Start with “B” and ends with “L” also Contains “A” replace the second character of the name with “G”
    If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Name");

        String Name=scan.next();
        String Name1="";


        if (Name.startsWith("A") && Name.endsWith("L")) {
            Name1=Name.replace("A","B");
            System.out.println(Name+ " is Changed with " +Name1);

        } else if (Name.startsWith("B") && Name.endsWith("L") && Name.contains("A")) {
            Name1=Name.replace(Name.charAt(1),'G');
            System.out.println(Name+ " is Changed with "+Name1);


        }else if (Name.startsWith("C") && Name.endsWith("K")) {

            if (Name.equals("CLARK")) {
                System.out.println(Name + " is equal to CLARK");
            } else {
                System.out.println(Name + " is not equal to CLARK");
            }


        } else {
            System.out.println("Try a different Name");
        }






    }
}
