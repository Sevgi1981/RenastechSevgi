package Day_7_Switch_Scanner;

public class Topic4_SwitchStatement {



        // the way it works is similar to the if statements
        // If we have a lot of condition to check
        /*
        variable name

        switch (name) {

        case ziya:  // else if
            break
        case mahir:  // else if
        :
        :
        :
        default: dsdfff // this is else statement

        }

         */
        public static void main(String[] args) {

            int number= 20;
            String Month = "";

            switch(number) { // where I put my variable

                case 1: Month ="Jan";   // if it is not true check the break
                    break;              // if that not the case give break // break equal else if//
                case 2: Month = "Feb";
                    break;
                case 3: Month = "Mar";  // does it matter number row where they are
                    break;
                case 4: Month = "Apr";  // if we have 2 same number as Case it gives error says -duplicate case label-
                    break;
                case 5: Month = "May";
                    break;
                case 6: Month = "June";
                    break;
                case 7: Month = "July";
                    break;
                case 8: Month = "Aug";
                    break;
                case 9: Month = "Sept";
                    break;
                case 10: Month = "Oct";
                    break;
                case 11: Month = "Nov";
                    break;
                case 12: Month = "Dec";
                    break;
                default: Month = "Invalid Month";  // if number none of those you should put it
                    break;
            }

            System.out.println("The month in this year is " +Month);


        }
}
