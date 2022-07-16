package Day_10_StringMethids;

public class Homework06 {

    public static void main(String[] args) {

        //  Write a program that will print the sum of the even numbers between 0-20 * include . Please use for loop and if statement.

        int a=20;
        int sumeven=0;
        int sumodd=0;

        for (int i = 0; i <=a ; i++) {
            if (i%2==0) {
                sumeven=sumeven+i;
                System.out.print(" " +i);
            }

        }
        System.out.println("\nsum of even numbers ="+sumeven);

        for (int i = 0; i <=a ; i++) {
            if (i %2 !=0) {
                sumodd=sumodd+i;
                System.out.print(" "+i);
            }

        }
        System.out.println("\nsum of odd numbers ="+sumodd);
    }
}
