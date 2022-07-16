package Day_11_ForLoop;

public class Topic3_ReverseString {
    public static void main(String[] args) {

        // Strings are indexed
        // the first char in a string has index of 0
        // the last char in a string has index of lenght-1


        String Canrem="Hello";

        System.out.println(Canrem.charAt(0));
        System.out.println(Canrem.charAt(Canrem.length()-1)); //last char at the string
        System.out.println(Canrem.charAt(Canrem.length()-2)); // second last at the string
        System.out.println(Canrem.charAt(Canrem.length()-5));

        String Reverse = "";

        for (int banu=Canrem.length()-1; banu >=0; banu--){ // it will start from the last index (4)

            Reverse = Reverse + Canrem.charAt(banu);


        }

        System.out.println(Reverse);





    }
}
