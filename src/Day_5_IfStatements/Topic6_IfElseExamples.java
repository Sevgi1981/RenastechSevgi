package Day_5_IfStatements;

public class Topic6_IfElseExamples {
    public static void main(String[] args) {

        String Person1Name = "Serdar";
        double Person1H = 5.9;
        int Person1age = 21;

        if (Person1H>6 && Person1age<24){
            System.out.println(Person1Name + " has been accepted for baseball");

        }else {
            System.out.println(Person1Name + " is not qualified");
        }



        if (Person1H>6 || Person1age<24){
            System.out.println(Person1Name + " has been accepted for baseball");

        }else {
            System.out.println(Person1Name + " is not qualified");
        }



    }
}
