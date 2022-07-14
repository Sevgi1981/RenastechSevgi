package Day_5_IfStatements;

public class IfElseHomeworkTeacher {

    /*  Tip Calculator  [if-else]

    Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
    In his country, it's usual to tip 15% if the bill value is between 99 and 280.
    If the value is different, the tip is 20%.

    Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).

    Example: "The bill was 275, the tip was 41.25, and the total value 316.25

    Data to test 97 ,100, 275 , 25
*/

    public static void main(String[] args) {

        double bill = 100;

        double tipRate = 0;
        double tip = 0;
        double finalBill = 0;

        //if the bill value is between 99 and 280.
        if (bill >= 99 && bill < 280) {
            //it's usual to tip 15%
            tipRate = 0.15;
            tip = bill * tipRate; // tip = %15 of the bill
            finalBill = bill + tip;

            System.out.println("bill= " + bill);
            System.out.println("tipRate= " + tipRate);
            System.out.println("tip= " + tip);
            System.out.println("finalBill= " + finalBill);


        } else {
            tipRate = 0.20;
            tip = bill * tipRate;
            finalBill = bill + tip;

            System.out.println("bill = " + bill);
            System.out.println("tipRate = " + tipRate);
            System.out.println("tip = " + tip);
            System.out.println("finalBill = " + finalBill);


        }

    }
}

