package Day_5_IfStatements;

public class Topic3_IfStatementcont {

    // lets define 3 different numbers
    // we will print the max number by locigal operations and is statements

    // write a code where it compares 3 diffeent numbers and prints the max. number

    public static void main(String[] args) {


        int number1 = 99;
        int number2 = 27;
        int number3 = 189;

        boolean bool1 = number1>number2 && number1>number3; // true && false = false
        boolean bool2 = number2>number1 && number2>number3; // false && false = false
        boolean bool3 = number3>number1 && number3>number2;  // true && true  = true

        if ( bool1) {     // bool1 yerine if (number1>number2 && number1>number3); bu sekildede olur
            System.out.println("The max number is:" +number1);
        }

        if (bool2) {
            System.out.println("The max number is:" +number2);
        }

        if (bool3) {
            System.out.println("The max number is:" +number3);
        }



    }
}
