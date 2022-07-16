package Day_10_StringMethids;

public class Homework_4 {
    public static void main(String[] args) {

        //Write a code where all where prints all the numbers between 0 to 10 (included)

        int sum=0;
        for (int i = 0; i <= 10; i++) {
            System.out.print(" , "+i);
            sum=sum+i;

        }
        System.out.println("\n" +sum);
    }
}
