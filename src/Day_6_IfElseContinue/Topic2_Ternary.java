package Day_6_IfElseContinue;

public class Topic2_Ternary {

    public static void main(String[] args) {

        // write a code where it checks 2 numbers and assign the bigger to variable called max

        int number1= 80;
        int number2= 50;
        int max;

        if (number1>number2) {
            max = number1;

        }else max= number2;

        System.out.println("The max is: " +max);


        // Ternary max= (number1>number2)  ?  number1 : number2;

        max = (number1>number2) ? number1 : number2;

        System.out.println("This is the second line " +max);


    }
}
