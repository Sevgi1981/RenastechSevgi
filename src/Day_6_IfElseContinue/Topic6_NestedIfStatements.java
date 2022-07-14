package Day_6_IfElseContinue;

public class Topic6_NestedIfStatements {

    public static void main(String[] args) {

        // if number is zero just print
        // if number is even less than 50 double it
        // if number is odd less than 70 triple it

        int number= 72;


        if ( number==0) {

            System.out.println("this number is: " +number);
            /*if () {
            } else if (){
                if () {
                }
            }
            */
        } else if (number%2 == 0) { // reminder 0 olanlardan 50 den kucuk olanlari 2 ile, digerlerini 4 ile carp
            if (number<50) {
                number = number*2;
            } else {
                number= number*4;
            }

        } else {

            if(number<70){  // 70 den kucukleri dikkate alacak
                number = number*6;
            }

        }

        System.out.println(number);

    }
}
