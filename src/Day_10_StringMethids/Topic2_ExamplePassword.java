package Day_10_StringMethids;

import java.util.Scanner;

public class Topic2_ExamplePassword {
    public static void main(String[] args) {

        // user is asked to put a valid email (username)
        // enter a  password where the password is at least 9 char

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a valid e-mail");
        String email = sc.next();

        System.out.println("Enter at least 9 Char password");
        String password= sc.next();

        String formatedemail = email.toLowerCase();

        if (!(formatedemail.startsWith("@gmail.com")) && formatedemail.length()>10 && formatedemail.contains("@gmail.com") && formatedemail.endsWith("@gmail.com")){
            System.out.println("email is valid");
        } else {
            System.out.println("your email is not a valid email");
        }

        if (password.length()>=9) {
            System.out.println("Valid Password");
        } else {
            System.out.println("invalid");
        }

    }
}
