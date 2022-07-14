package Day_8_Scanners;

public class SwitchStatementpre4 {
    public static void main(String[] args) {

        // You can also use switch for Strings. So I am gonna do that right now.
        // let say we have number of country and we want to check what is the capital city for each country


        String countryName="Germany";
        String capitalCity;

        switch (countryName) {
            case "Canada": capitalCity="Ottawa";
            break;

            case "Turkey": capitalCity="Ankara";
            break;

            case "Germany": capitalCity="Berlin";
            //break;

            case "Italy": capitalCity="Rome";
            //break;

            case "Spain": capitalCity="Madrid";
            break;

            default: capitalCity="it is not include in the list";
            break;


        }

        System.out.println(capitalCity);

    }
}
