package Day_8_Homeworks;

import java.util.Scanner;

//Write a program Where user is being ask to select items from the list you presented for instance:
//        Select 1 for Shirt
//        Select 2 for pants
//        select 3 for dress
//        select 4 for hat
//        select 5 for shoes
//        User will select one item each time and until users has 3 items.
//        shirt price is = 40
//        pants price is = 60
//        dress price is = 100
//        hat price is = 10
//        shoes price is = 120
//        if user total amount is more than 200, user will receive 20% off on the total price (edited)
//        7:26
//        if user total amount is more than 150, user will receive 15% off on the total  price (edited)
//        7:27
//        if user total amount is more than 100, user will receive 5% off on the total price (edited
//
//         */
public class Homework_10 {
    public static void main(String[] args) {

        int shirt = 40;
        int pants = 60;
        int dress = 100;
        int hat = 10;
        int shoes = 120;
        double result1=0;
        double result2=0;
        double result3=0;


        Scanner scan=new Scanner(System.in);
        System.out.println("1) Select 1 for Shirt= 40 \n2) Select 2 for pants=60\n3) Select 3 for dress=100\n4) Select 4 for hat=10\n5) Select 5 for shoes=120");
        System.out.println("Enter your first number");
        int select1=scan.nextInt();

        if (select1==1) {
            //System.out.println(shirt);
            result1=shirt;
        } else if (select1==2) {
            result1=pants;
        } else if (select1==3) {
            result1=dress;
        } else if (select1==4) {
            result1=hat;
        } else if (select1==5) {
            result1=shoes;
        } else {
            System.out.println("invalid");

        }
        System.out.println("Enter your second number");
        int select2=scan.nextInt();
        if (select2==1) {
            result2=shirt;

        } else if (select2==2) {
            result2=pants;
        } else if (select2==3) {
            result2=dress;
        } else if (select2==4) {
            result2=hat;
        } else if (select2==5) {
            result2=shoes;
        } else {
            System.out.println("invalid");
        }

        System.out.println("Enter your third number");
        int select3=scan.nextInt();
        if (select3==1) {
            result3=shirt;

        } else if (select3==2) {
            result3=pants;
        } else if (select3==3) {
            result3=dress;
        } else if (select3==4) {
            result3=hat;
        } else if (select3==5) {
            result3=shoes;
        } else {
            System.out.println("invalid");
        }



       if (+(select1+select2+select3)>200){
           System.out.println("Total amount with %20 discount is " +(result1+result2+result3)*0.8);
         } else if ((result1+result2+result3)>=200 && (result1+result2+result3)>150){
           System.out.println("Total amount with %15 discount is " +(result1+result2+result3)*0.75);
        } else if ((result1+result2+result3)>=150 && (result1+result2+result3)>100){
           System.out.println("Total amount with %5 discount is " +(result1+result2+result3)*0.95);
        } else {
            System.out.println("Total amount without discount is " +(result1+result2+result3));
        }

    }
}
