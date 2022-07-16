package Presentation;

import Day_8_Scanners.SwitchScannerPre2;

import java.util.Scanner;

public class Pre_SwitchSta1 {

    public static void main(String[] args) {

        // switch statement is used when we have number of options, and we need to perform a different task for each one.
        // in if condition statements, you need to repeat same command that causes feeling exhausted to write.
        // in like this cases we can use switch statement instead of if condition because it is easier to look at and to understand.
        // for example, we want user to select a number and see which day has what type of activity in a Sport Facility.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Select a number for day");
        System.out.println("1)Monday\n2)Tuesday\n3)Wednesday\n4)Thursday\n5)Friday\n6)Saturday\n7)Sunday");
        int day= scan.nextInt();

        // switch mean=switch will ask you for a variable, switch will check cases and if it is match with 1 then day name will be Monday
        // put the variable that we want to switch between
        // break means= if this case is true then break the switch, if it is not true check the break. break equal else if.

        String dayName="";
        String activity="";


        switch (day){

            case 1: dayName="Monday";
                activity="Swimming";
                break;
            case 2: dayName="Tuesday";
                activity="Hiking";
                break;
            case 3: dayName="Wednesday";
                    activity="Soccer";
                    //break;
            case 4: dayName="Thursday";
                activity="Basketball";
                break;
            case 5: dayName="Friday";
                activity="Voleyball";
                break;
            case 6: dayName="Saturday";
                activity="Saturday is Holiday";
                break;
            case 7: dayName="Sunday";
                activity="Sunday is Holiday";
                break;
            default: dayName="Please enter a valid day number";
                break;




        }
        System.out.println(dayName+ " is " +activity+ "day");

    }
}
