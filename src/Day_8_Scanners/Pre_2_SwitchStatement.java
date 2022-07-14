package Day_8_Scanners;

import java.util.Scanner;

public class Pre_2_SwitchStatement {
    public static void main(String[] args) {

        // we have number of country and we want user to see what is the capital city for each country

        Scanner scan=new Scanner(System.in);
        System.out.println("Please select one of these country name for seeing what is its capital city.");
        System.out.println("Canada, Turkey, Italy, Spain, Germany");


        String capitalCity="";
        String countryName=scan.next();

        switch (countryName){
            case "Canada": capitalCity="Ottawa";
            break;
            case "Turkey": capitalCity="Ankara";
            break;
            case "Italy": capitalCity="Rome";
            break;
            case "Spain": capitalCity="Madrid";
            break;
            case "Germany": capitalCity="Berlin";
            break;
            default: capitalCity="Please Enter Listed country name";
            break;

        }

        System.out.println(capitalCity);


    }
}
