package Day_4_Operators;

public class AssignmentOperators {

    public static void main(String[] arg){

        int box= 10;
        box = 15;     // do not need to specify the data type again
         //box = box+10; // the first box is empty for now, the second has the value of previous.
                      // new box value will be assigned
                      // result will be 25

        box += 10; // it is equal to box = box +10
        System.out.println(box);  // result will be same 25

        int box1 = 20;
        box1 = box1 - 10; // box1 -=10  they are equal the same
        System.out.println(box1);  // result will be 10

       int num1 = 20;
       num1 %=3;  // 3 e bolumden kalan 2
        System.out.println(num1); //  result will be 2





    }
}
