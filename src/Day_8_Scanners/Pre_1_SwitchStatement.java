package Day_8_Scanners;

import java.util.Scanner;

public class Pre_1_SwitchStatement {
    public static void main(String[] args) {

        // switch statement is used when we have number of options, and we need to perform a different task for each one.
        // in if condition statements, you need to repeat same command that causes you feel exhausted to write.
        // in that cases we can use switch statement instead of if condition because it is easier to look at and understand.
        // for example, we want user to select a number and see which day has what type of activity in a Sport Facility.

        ////////
        // switch mean=switch will ask you for a variable, switch will check cases and if it is match with 1 then day name will be Monday
        // put the variable that we want to switch between
        // break means= if this case is true then break the switch, if it is not true check the break. break equal else if.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Select a number to see which day has what activity");
        System.out.println("Select \n1)Monday \n2)Tuesday \n3)Wednesday \n4)Thursday \n5)Friday \n6)Saturday \n7)Sunday");


        String activity="";
        String dayName="";
        int day=scan.nextInt();


        switch (day){
            case 1:dayName="Monday";
                activity="Swimming";
            break;
            case 2:
                dayName="Tuesday";
                activity="Hiking";
            break;
            case 3:dayName="Wednesday";
                activity="Skiing";
            break;
            case 4:dayName="Thursday";
                activity="Soccer";
            break;
            case 5:dayName="Friday";
                activity="Basketball";
            break;
            case 6:dayName="Saturday";
                activity="Saturday is Holiday";
            break;
            case 7:dayName="Sunday";
                activity="Sunday is Holiday";
            break;

            default:
                System.out.println("Please Enter a valid number");
        }

        System.out.println(dayName+ activity);

    }
}
