package Day_8_Scanners;

import java.util.Scanner;

public class SwitchScannerPre2 {

    // we have numbers of country and we want user to see what is the capital city for each country


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Write a country name that you want to see What is its Capital City. " +
                "\nChoose one of them : Canada, Turkey, Spain, Italy or Germany");

        String capitalCity="";
        String countryName=scan.next();


        switch (countryName){
            case "Canada": capitalCity="Ottawa";
            break;
            case "Turkey": capitalCity="Ankara";
            break;
            case "Spain": capitalCity="Madrid";
            break;
            case "Italy": capitalCity="Rome";
            break;
            case "Germany": capitalCity="Berlin";
            break;
            default: capitalCity="This Country does not include the list above ";
            break;

        }


        System.out.println(capitalCity);




    }
}
