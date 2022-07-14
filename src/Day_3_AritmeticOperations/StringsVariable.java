package Day_3_AritmeticOperations;

public class StringsVariable {

    public static void main(String[] args) {

        // String is not a primitive Data Type. birincil-temel

        String name = "addkghdjdjdjd 1234555"; // that is not a number, it is a text, even includes numbers, it is an object
        String name2 = "Ziya"; // that is also a text
        String name3= name+ name2;
        System.out.println(name3); // birlestiriyor
        String name4 = name+ " Likes to teach " +name2;  //  ("  ") gives space
        System.out.println(name4);

        System.out.println("This is name2: " +name2);
        int a=8;
        int b=9;

        System.out.println("This is the number a: " +a);

        float numf2 = 7.9f;
        System.out.println("This is the float number: "  +numf2);
        String thisisatext = "Yasin this is a text 123456";
        System.out.println(thisisatext);

        char ch = 'R';
        String st = "Toys" + "-" +ch+" "+"Us";
        System.out.println(st);

        int numnum = 34;
        String nam20= "This is Us";
        String nam30 = nam20 + " " +numnum;
        System.out.println(nam30);



    }
}
