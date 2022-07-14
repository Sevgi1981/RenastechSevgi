package Day_3_AritmeticOperations;

public class AritmeticOperations {

    public static void main(String[] args){
        // addition (+) it is used to add number

        int number1=10;
        int number2=20;

        float numberf1=40.7f;  // to able to define it should be the same variables
        double numberd1= 76.9878999;
        long numberl1=6476487834l;

        //int number3=number1+numberf1  // gives error

        float number3=number1+numberf1; // if it stays as int it won`t print
                                         // if change as float it will print
                                        // not necessary to print additions
        float num1=10.6f;
        float num2=5.4f;
        // int num3=num1+num2; // it gives error because they are not float// even result is 16.0


        // System.out.println(number1+number2);

        System.out.println(number3);

        System.out.println(number1+numberf1);  // it will print because they have value


        // Subtraction (-)

        int num4 = 50;
        int num5 = 70;
        int num6 =num4 - num5;

        System.out.println(num6);
        System.out.println(num4-num5);

        int num7=80;
        float num8=90.6f;

        // int num9=num7-num8; it wil give error
        float num9=num7 - num8;

        long num10=76364789l;
        int num11=786;
        // int num12= num10+num11;  it gives error, wants to chang to long
        // because long bigger than int


        System.out.println(num7-num8); // it will work

        // multiplication (*)

        int multi1 = 20;
        int multi2 = 30;
        int multi3 = multi1 * multi2;

        System.out.println(multi1 * multi2);
        System.out.println(multi3);

        // division (/)
        int divis1 = 60;
        int divis2 = 30;
        int divis3 = divis1/divis2;

        System.out.println(divis3);

        int divis4 = 4;
        int divis5 = 3;
         // int divis6 = divis4/divis5; int oldugu icin computer sonucu int olarak goruyor
        float divis6 = (float) divis4/divis5; // ekstra float yazarken compu. float oldugunu anlar

        System.out.println(divis6);
        System.out.println(divis4/divis5); // comp assign it as an int

        // modulus (%), it gives you the reminder of the division

        int mod1 = 10;
        int mod2 = 5;
        int mod3 = 10%5;
        System.out.println(mod3); // reminder is zero - 0

        int mod4 = 11;
        int mod5 = 5;
        System.out.println(mod4%mod5);

        float mod6 = 5.8f;
        int mod7 = 2;
        float mod8 = mod6%mod7;
        System.out.println(mod8);






    }

}
