package Day_11_ForLoop;

public class Topic1_ForLoop {


    // for (startingpoint; endpoint; iteration) {
    // Code block that will be run
    // }

    public static void main(String[] args) {

        // write a for loop that increase by 2 for each iteration

        for (int i = 1; i<100; i+=2) {  // 1-3-5....101
           // System.out.println("The value of i : " +i);// 1-3-5....99
        }


        // write a code that counts the iterations

        int count = 0;
       for(int i = 1; i<100; i+=2) { // 99 count
           System.out.println("The value of i: " +i);
           count = count +1;   // 1,2,3,4,......50         // count is mean that how many time code run //50 times
           //count++;  // the same thing with  -- count = count +1; --/

       }
        System.out.println(count);



    }
}
