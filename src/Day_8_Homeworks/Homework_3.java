package Day_8_Homeworks;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

// Write a Revenue program, Where user enters the quantity of the products sold and  the price for each product.
// Then Calculate the revenue based on giving information (hint: Revenue = quantity x price)

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("TOTAL REVENUE OF RED GLOVES ");

        System.out.println("Enter the quantity of sold red gloves");
        double redGlovQ= scan.nextDouble();

        System.out.println("Enter the each price of red gloves");
        double redGlovP= scan.nextDouble();

        System.out.println("The Revenue of Red Gloves is $" +redGlovQ*redGlovP);

    }
}
