package Day_5_IfStatements;

public class Topic4_PositiveNegative {

    public static void main(String[] args) {

        // we want to check if the number is possitive, negative or 0 (zero)

        int number= 0;
        if (number>0) {
            System.out.println("The number " +number+ " is Positive");
        }

        if ( number<0) {
            System.out.println("The number " +number+ " is Negative");
        }

        if ( number==0) {
            System.out.println("The number " +number+ " is Zero");
        }

    }
}
