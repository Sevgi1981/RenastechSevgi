package Day_8_Scanners;

import java.util.Scanner;

public class SwitchStatementPre1 {

    // switch statement is used when we have number of options, and we need to perform a different task for each one.
    //  in if condition statements, you need to repeat same command that causes you feel exhausted to write.
    // in that cases we can use switch statement instead of if condition because it is easier to look at and understand.

    // for example, we have days of a week, and we have numbers related to those days.
    // we want user to select a number and see which day has what type of activity in the facility.

    // 1 -- Sunday
    // 2 -- Monday

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Select; \n 1 for Sunday  \n 2 for Monday  \n 3 for Tuesday  \n 4 for Wednesday " +
                "  \n 5 for Thursday \n 6 for Friday \n 7 for Saturday ");


        String dayName="";
        String activityName="";
        int day = scan.nextInt();
        // put the variable that we want to switch between

        switch (day) {                    // switch will ask you for a variable
            case 1: dayName = "Sunday";  // switch will check cases and if it is match then day name will be Sunday
                activityName= "holiday";
                break;                      // if this case is true then break the switch, if it is not true check the break/ equal else if
            case 2: dayName = " Monday";       // if you have break it means stop looking at the other cases.
                activityName= "Swimming";
                break;                      // if we dont put break, we will see the next variable which is until next break
            case 3: dayName = " Tuesday";
                activityName= "Running";
                break;
            case 4: dayName = " Wednesday";
                activityName= "Hiking";
                break;
            case 5: dayName = " Thursday";
                activityName= "Jogging";
                break;
            case 6: dayName = " Friday";
                activityName= "Skating";
                break;
            case 7: dayName = " Saturday";
                activityName= " Skiing";
                break;
            default:
                System.out.println("Please Enter a valid day number");

            }

            System.out.println(dayName+ " is " +activityName+ " day");


        }








    }


