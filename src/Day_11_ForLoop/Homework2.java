package Day_11_ForLoop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Homework2 {

    //Interview Question :
    ////    (String) Reverse
    ////    Write a  program that can reverse  a String

    ////    Ex: Reverse("ABCDE"); ==> EDCBA

    public static void main(String[] args) {

        String str="ABCDE";
                   //01234
        String reversed="";


        for (int i =str.length()-1; i >= 0 ; i--) {

            System.out.println(str.charAt(i));
            reversed+=str.charAt(i);


        }

        System.out.println("reversed " +reversed);

    }
}
