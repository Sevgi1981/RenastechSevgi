package Day_3_AritmeticOperations;

public class RelationalOperations {

    public static void main(String[] args) {

        int number = 10;

        // 1st logical expression
        // == the options are either true or false

        boolean b1 = 10 == 10;      // result will be true
        System.out.println(b1);

        boolean b2 = "sevgi" == "sevgi";  // result is true
        System.out.println(b2);

        boolean b3 = "Sevgi" == "sevgi";  // result is false
        System.out.println(b3);


        // 2nd logical expression
        // >= checks 2 two things if it is greater or equal it will return true

        boolean b4 = 12  >= 10;  // true
        System.out.println(b4);

        boolean b5 = 12  >= 200;  // false
        System.out.println(b5);
        System.out.println(12>=200);  // false

        // 3th <= check 2 things and if it less or equal it returns as true, otherwise it is false
        boolean b6= 14 <=15;
        System.out.println(b6);  // true
        boolean b7 = 17<=16;
        System.out.println(b7); // false

        // 4th != compares 2 things if they are equal it will return true, otherwise it will be false
        boolean b8= 14 != 14;
        System.out.println(b8);
        boolean b30= 27 != 23;
        System.out.println(b30);  // true

        // 5th > compares two things if oen is greater than the other it will be true, otherwise it will be false

        boolean b9 = 14 > 15;
        boolean b10=  30> 20;

        //6th < compares two things if one is less than the other it will be true, otherwise it will be false
        boolean b11 = 11< 9000;
        boolean b12 = 900< 100;
        System.out.println(b11); // true
        System.out.println(b12);  // false

        boolean b13= true == false; // -- false  // boolean b13= !(true == false); true
        System.out.println(b13);

        // ! it will convert false to true/ true to false

        boolean b14= !((true == false) == !(10<=11)); //
                      //  ! (false == false) // !true // false
        System.out.println(b14);

        boolean b15= !(('C'=='c')== (13==14) == !(("er"=="ER") == (true==true)));
        System.out.println(b15);


        //  !( false == false == ((true) == ( true))
        //  ! (true == true)
        // false



    }
}
