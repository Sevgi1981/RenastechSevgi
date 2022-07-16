package Day_11_ForLoop;

public class Topic_2_ForLoopExample {
    public static void main(String[] args) {

        //write a code where the code prints all the even numbers between 0 to 100; (100 included)
        // if a number is divided by 2 with no reminder then it is an even number

        int totaliter = 0;
        System.out.println("The even numbers: ");

        for (int i = 0; i <= 100; i++) {  // 0,1,2,3,4....101 times printed

            if (i % 2 == 0) {  // checking if number can be divided by 2
                System.out.print(" " + i); //0,2,4,6,8...100
            }

            totaliter++; // increase the count of iteration by 1;

        }
        System.out.println("\n" + "Total count of iteration: " + totaliter);


        // this is a second way to do it
        System.out.println("This is a second way");
        int count=0;
        for (int j = 0; j <= 100; j += 3) {

            System.out.print(" "+j);
            count++;

        }

        System.out.println("\n"+"the total iteration for second way: " +count);


    }
}
