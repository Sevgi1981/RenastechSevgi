package Day_7_Switch_Scanner;

public class Topic5_SwitchContinue {
    public static void main(String[] args) {

        String two= "Mo";

        switch (two) {

            case "Mo":
                System.out.println("Monday");   // "Mo" if you delete break until wednesday include,
                break;                          // it print until the next break. like monday-tuesday-Wednesday
            case "Tu":
                System.out.println("Tuesday");
                break;
            case"We":
                System.out.println("Wednesday");
                // whatever you write here. it will print
                break;
            case "Th":
                System.out.println("Thursday");
                break;
            case "Fr":
                System.out.println("Friday");
                break;
            case "Sa":
                System.out.println("Saturday");
                break;
            case "Su":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");  // if none of them it will print that


        }

    }
}
