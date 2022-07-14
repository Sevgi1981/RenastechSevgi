package Day_4_Operators;

public class PrimitiveCasting {

    public static void main (String[] args){

        // Casting from size to bigger size is not an issue, but going from bigger size to smaller we have to specify
        int A= 300;
        // byte B = A; gives error
        byte B= (byte) A; // 300 int is equal to 44 byte// because of 44
        System.out.println(B);

        byte number1 = 100;
        int number2 = number1; // because int bigger than byte
        System.out.println(number2);

        byte number3 = (byte) number2;
        System.out.println(number2);

        int number5 = 43782658;
        long number6 = number5;

        long number7 = 897456315l;
        int number8 = (int) number7;

        float number9 = 89.9f;
        double number10 = number9;

        int numberint = 3938393;
        float numberfloat = (float) numberint;
        System.out.println(numberfloat);




    }
}
