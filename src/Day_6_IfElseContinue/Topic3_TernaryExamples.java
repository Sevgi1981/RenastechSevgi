package Day_6_IfElseContinue;

public class Topic3_TernaryExamples {

    public static void main(String[] args) {

        // check the number if is even or odd

        int num = 90;
        String Result;

        if (num%2==0) {
            Result="Even";
            System.out.println("The number is: " +Result);

        } else {
            Result= "Odd";
            System.out.println("The number is: " +Result);

        }

        Result= (num%2==0) ? "Even" : "Odd";
        System.out.println("The number is: " +Result);

    }
}
