package Day_10_StringMethids;

public class Homework08 {
    public static void main(String[] args) {

        //Write   a   program   that   will   count   how   many   times   "a"   is   found   in   any   given   String:
        //String mystring="java is fun, but sometimes java is just pain.Love java java java";

        String str = "java is fun, but sometimes java is just pain.Love java java java";

        int count=0;

        for (int i = 0; i < str.length() ; i++) {

            if (str.charAt(i)=='a') {

                count++;
            }


        }
        System.out.println("count a =" +count);




    }
}
