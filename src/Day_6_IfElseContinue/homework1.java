package Day_6_IfElseContinue;

public class homework1 {
    public static void main(String[] args) {

        // //Telephone Bill
        ////Write a program to calculate the monthly telephone bills as per the following rule:
        ////Minimum Rs. 200 for up to 100 calls.
        ////Plus Rs. 0.60 per call for the next 50 calls.
        ////Plus Rs. 0.50 per call for the next 50 calls.
        ////Plus Rs. 0.40 per call for any call beyond 200 calls.

                int call=130;
                double bill=0;


                if (call<=100&&call>=0) {
                    bill= 200;
                    System.out.println("Telephone Bill is: " +bill);

                } else if  ( call>100 && call<=150) {
                    bill=200 +(call - 100 )*0.6;
                    System.out.println( "Telephone Bill is: " +bill);

                }else if (call>150 && call<=200){
                    bill= 200+ (call - 100 )*0.6 +(call- 150)*0.5;
                    System.out.println( "Telephone Bill is: " +bill);

                }else  {
                    bill= 200+ (call - 100 )*0.6 +(call- 150)*0.5+(call- 200)*0.4;
                    System.out.println("Telephone Bill is: " +bill);
                }

    }

}




