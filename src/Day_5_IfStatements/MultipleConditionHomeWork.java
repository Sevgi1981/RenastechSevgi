package Day_5_IfStatements;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class MultipleConditionHomeWork {

    /*Coding Alexa for Weather [multiple Conditions]

    New graduate Renastech students want to improve Alexa and they will add weather functionality;
    Please help students with the assignment below.
-Ask the user what's temperature is Fahrenheit;

            -Convert the value to Celsius formula :  C = F-32 / 1.80

            if temperature is  -10 or below  ==> print it's too cold
            if temperature is between -10 and 0 ==> print  it's cold
            if temperature is between 0 and 15 ==> print it's not cold
            if temperature is between 15 and 40 ==>print it's warm
            if temperature is 40 and 60 ===> print it's extremely hot!!
            if temperature is above 60 ==> print hot as hell

    Data to test: -40 F , 5F , 50f, 82, 130F, 400F

     */

    public static void main(String[] args) {

        int tempF=50;
        double tempC=(tempF-32)/1.8;

        if (tempC<=-10) {
            System.out.println("The temperature is " +tempF+ "F," + " it is too cold");
        } else if (tempC>=-10 && tempC<=0) {
            System.out.println("The temperature is " +tempF+ "F," + " it is cold");
        } else if (tempC>=0 && tempC<=15) {
            System.out.println("The temperature is " +tempF+ "F," + "it is not cold");
        } else if (tempC>=15 && tempC<=40) {
            System.out.println("The temperature is " +tempF+ "F," + "it is warm");
        } else if (tempC>=40 && tempC<=60){
            System.out.println("The temperature is " +tempF+ "F," + "it is extremely hot");
        } else if (tempC>=60){
            System.out.println("The temperature is " +tempF+ "F," + "it is hot as hell !!");
        }


    }
}
