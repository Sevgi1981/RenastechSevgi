package Day_5_IfStatements;

public class Topic8_IfElseIfElseExamples {

    // 100- 90 will result A grade
    // 89 - 80 will result B grade
    // 79 - 70 will result C grade
    // 69 - 60 will result D grade
    // 59 - 50 will result F grade

    public static void main(String[] args) {

        int Point = 78;

        if (Point >= 90) {
            System.out.println("The Grade is A");
        } else if (Point >= 80 && Point < 90) {
            System.out.println("The Grade is B");
        } else if (Point >= 70 && Point < 80) {
            System.out.println("The Grade is C");
        } else if (Point >= 60 && Point < 70) {
            System.out.println("The Grade is D");
        } else  {
            System.out.println("The Grade is F");
        }
    }

    }
