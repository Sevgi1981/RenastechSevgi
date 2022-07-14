package Day_5_IfStatements;

public class IfElseHomework1 {

    //// Tip Calculator  [if-else]
    //
    //Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
    //In his country, it's usual to tip 15% if the bill value is between 99 and 280.
    //If the value is different, the tip is 20%.
    //
    //Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).
    //
    //Example: "The bill was 275, the tip was 41.25, and the total value 316.25
    //
    //Data to test 97 ,100, 275 , 25
    public static void main(String[] args) {

        double bill=97.0;

        if (bill>=99.0 && bill<=280.0) {
            System.out.println("The bill was " +bill+ " \tthe tip was " +(bill*15/100)+ " \tthe total value " +(bill+(bill*0.15)));
        } else {
            System.out.println("The bill was " +bill+ ",\tthe tip was " +(bill*20/100)+ "\tand the total value " +(bill+(bill*0.20)));
        }

        double bill2=100.0;
        if (bill2>=99 && bill2<+280){
            System.out.println("The bill was " +bill2+ ",\tthe tip was " +(bill2*15/100)+ "\tand the total value " +(bill2+(bill2*0.15)));
        } else {
            System.out.println("The bill was " +bill2+ ",\tthe tip was " +(bill2*20/100)+ "\tand the total value " +(bill2+(bill2*0.20)));
        }

        double bill3=275.0;
        if (bill3>=99 && bill3<+280){
            System.out.println("The bill was " +bill3+ ",\tthe tip was " +(bill3*15/100)+ "\tand the total value " +(bill3+(bill3*0.15)));
        } else {
            System.out.println("The bill was " +bill3+ ",\tthe tip was " +(bill3*20/100)+ "\tand the total value " +(bill3+(bill3*0.20)));
        }

        double bill4=25.0;

        if (bill4>=99 && bill4<+280){
            System.out.println("The bill was " +bill4+ ",\tthe tip was " +(bill4*15/100)+ "\tand the total value " +(bill4+(bill4*0.15)));
        } else {
            System.out.println("The bill was " +bill4+ ",\tthe tip was " +(bill4*20/100)+ "\tand the total value " +(bill4+(bill4*0.20)));
        }
    }
}

