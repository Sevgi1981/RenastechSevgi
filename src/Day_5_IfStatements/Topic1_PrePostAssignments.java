package Day_5_IfStatements;

public class Topic1_PrePostAssignments {

    public static void main(String [] args){

        int a = 10;
        a = --a + 10 + --a; // 19+8  = 27
        System.out.println(a);


        int b = 11;
        System.out.println(++b + 5 + b++);// 12+5+12=29



    }
}
