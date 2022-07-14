package Day_2_Variables;

public class Variables {
    public static void main(String[] args) {
        // boolean, it is true or false. it is 1 bit, make a decision
        boolean bolvalue = true;
        System.out.println(bolvalue);
        bolvalue = false;
        System.out.println(bolvalue);


        // char, it 16 bytes memories, it contains characters, numbers and ...
        // char need single quote
        char charvalue='w';
        System.out.println(charvalue);


        // byte, it is 8 bit, values between -128 to 127                        -- smallest memory
        byte bytevalue = 120;
        System.out.println(bytevalue);


        // short, it takes the values between -32768 to +32767                  -- medium memory
        short shortvalue = 3000;
        System.out.println(shortvalue);

        // int, it is short of integers. 32 bits -2.000.000 to +2.000.000       -- large
        int intvalue=40000;
        System.out.println(intvalue);


        // long, 64 bits memory,                                                -- largest memory
        long longvalue=23484697l;
        System.out.println(longvalue);

        System.out.println("**********");

        // float, it is 32 bits it holds only 5 decimal digits                  -- small decimal
        float floatvalue= 123.7f;
        System.out.println(floatvalue);
        float floatvalue2=123.787564563f; // up to 7 decimal digit numbers shown
        System.out.println(floatvalue2);

        // double, 64 bits can it can hold up to 16 digits after decimal point  -- large decimal
        double doublevalue=123.8978888888888888888;
        System.out.println(doublevalue);

        // non-primitive,




    }
}
