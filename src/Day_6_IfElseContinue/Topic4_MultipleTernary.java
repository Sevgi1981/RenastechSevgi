package Day_6_IfElseContinue;

public class Topic4_MultipleTernary {

    public static void main(String[] args) {

        // number is 0 just say zero
        // if is even just say even
        // or if it is odd just say it is odd

        int num = 15;
        String result;

        if (num ==0) {    // first we check equal to zero/ then check reminder is zero
            result= "Zero";

        } else if (num%2 == 0) {
            result= "Even";

        } else result = "Odd";

        // ternary

        result= (num ==0) ? "Zero" : (num%2 == 0) ? " Even" : "Odd";

        System.out.println("The number is : " +result);

    }
}
