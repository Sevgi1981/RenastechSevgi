package Presentation;

import java.util.Scanner;

public class Pre_SwitcSt2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        System.out.println("Please select one of these country name for seeing what is its capital city.");
        System.out.println("Canada, Turkey, Italy, Spain, Germany");

        String capitalCity="";
        String countryName=scan.next();

        switch (countryName){

            case "Canada":capitalCity="Ottawa";
            break;
            case "Turkey":capitalCity="Ankara";
            break;
            case "Italy": capitalCity="Rome";
            break;
            case "Spain": capitalCity="Madrid";
            break;
            case "Germany":capitalCity="Berlin";
            break;

            default:
            System.out.println("Please enter listed country");
            break;
        }

        System.out.println(capitalCity);


    }
}
