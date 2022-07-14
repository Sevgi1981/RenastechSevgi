package Day_7_Switch_Scanner;

public class Topic2_IfandIfElse {

    public static void main(String[] args) {

        String cls="JAVA";  // if this place is empty output is gonna print all of them JAVA HTML CSS

        if (cls != "JAVA"){ // false
            System.out.println("Person is added to Java Class");
        }
        if (cls != "HTML"){ // true
            System.out.println("Person is added to HTML Class");
        }
        if (cls !="CSS"){  // true
            System.out.println("Person is added to CSS Class");
        }


    }
}
