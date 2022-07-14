package Day_4_Operators;

public class PrePostConditions {
    public static void main(String[] args) {

        // after ++  // post

        int num = 10;
        System.out.println(num++); //  it is 10 // first print 10 then increase / that will change the next number-
        System.out.println(num); // it will be 11

        num++; // it is 12
        System.out.println(num);

        // before ++ and your variable; // pre

        int num1= 10;
        System.out.println(++num1); // it will change immediately // it is 11
        System.out.println(num1);  // 11

        // after -- (variable)

        int num2= 20;
        System.out.println(num2--); // 20
        System.out.println(num2); // 19

        int num3 = 15;
        System.out.println(--num3); // 14







    }
}
