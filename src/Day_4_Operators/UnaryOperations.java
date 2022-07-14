package Day_4_Operators;

public class UnaryOperations {
    public static void main(String[] args) {

        // Unary Plus: (+) it does not have any effect on the number
        // Unary Minus:(-) it will change the sign or the value to be opposite

        int number = 10;
        number = +number;
        System.out.println(number);

        int number2 = -20;
        number2 = -number2;
        System.out.println(number2);

        int number3 = 30;
        number3 = -number3;
        System.out.println(number3);

        // increasement Operator (++) // it increase the number by 1;

        int number4= 8;
        number4++; // number4 = number4 + 1
        ++number4;
        System.out.println(number4);

        // Decreasement Operator (--) it will decrease the number by 1

        int number5 = 30;
        number5--; // number5 = number5 - 1
        System.out.println(number5);

        --number5;
        System.out.println(number5);

        // (!) it inverts the boolean values. if it is true it will false, if it false it will invert to true

        boolean bool = true;
        bool = !bool;  // false
        System.out.println(bool);







    }
}
