package Day_6_IfElseContinue;

public class Topic1_IfElseExamples {

    public static void main(String[] args) {

        // Water temp is 100 it is boiling
        // Water temp is 0 it is freezing
        // Water temp is 0<temp<10 so cold
        // Water temp is between 10-30 will cold
        // Water temp is between 60-90 Hot
        // Water Temp 90<temp<100 So Hot,
        // Rest Room Temp

        String WaterCond;
        int temp = 50;

        if (temp == 100) {
            WaterCond = "Boiling";
            System.out.println("The Water condition is: " +WaterCond);

        } else if (temp == 0) {
            WaterCond = "Freezing";
            System.out.println("The Water condition is: " +WaterCond);
        }else if (temp>0 && temp<10){
            WaterCond = "So Cold";
            System.out.println("The Water condition is: " +WaterCond);
        } else if (temp>=10 && temp<30) {
            WaterCond = "Cold";
            System.out.println("The Water condition is: " +WaterCond);
        } else if  (temp>=60 && temp<90) {
            WaterCond = "Hot";
            System.out.println("The Water condition is: " +WaterCond);
        } else if (temp>=90 && temp<100) {
            WaterCond = "So Hot";
            System.out.println("The Water condition is: " +WaterCond);
        } else {
            WaterCond = "Room Temp";
            System.out.println("The Water condition is: " +WaterCond);
        }


    }
}
