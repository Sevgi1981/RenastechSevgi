package Day_8_Homeworks;

import java.util.Scanner;

/*
        Challenge Question:
        Write a program Where user is being ask to select items from the list you presented for instance:
        Select 1 for Shirt
        Select 2 for pants
        select 3 for dress
        select 4 for hat
        select 5 for shoes
        User will select one item each time and until users has 3 items.
        shirt price is = 40
        pants price is = 60
        dress price is = 100
        hat price is = 10
        shoes price is = 120
        if user total amount is more than 200, user will receive 20% off on the total price (edited)
        7:26
        if user total amount is more than 150, user will receive 15% off on the total  price (edited)
        7:27
        if user total amount is more than 100, user will receive 5% off on the total price (edited

         */
public class Homework_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double item1=40;
        double item2=60;
        double item3=100;
        double item4=10;
        double item5=120;
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        System.out.println("Please Select only 3 items please");
        System.out.println("1)Select 1 for Shirt\n2)Select 2 for pants\n3)Select 3 for dress\n4)Select 4 for hat\n5)select 5 for shoes");

        System.out.println("Enter First item");
        int select1 = scan.nextInt();

        if (select1==1) {
            result1=item1;
            System.out.println("shirt: $"+item1);
        } else if (select1==2) {
            result1=item2;
            System.out.println("pants: $"+item2);
        }else if (select1==3) {
            result1=item3;
            System.out.println("dress: $"+item3);
        }else if (select1==4) {
            result1=item4;
            System.out.println("hat: $"+item4);
        }else if (select1==5) {
            result1=item5;
            System.out.println("shoes: $"+item5);
        } else {
            System.out.println("invalid");
        }

        System.out.println("Enter Second Item");
        int select2 = scan.nextInt();
        if (select2==1) {
            result2=item1;
            System.out.println("shirt:$"+item1);

        } else if (select2==2) {
            result2=item2;
            System.out.println("pants: $"+item2);
        }else if (select2==3) {
            result2=item3;
            System.out.println("dress: $"+item3);
        }else if (select2==4) {
            result2=item4;
            System.out.println("hat: $"+item4);
        }else if (select2==5) {
            result2=item5;
            System.out.println("shoes: $"+item5);
        } else {
            System.out.println("invalid");
        }


        System.out.println("Enter Third Item");
        int select3 = scan.nextInt();
        if (select3==1) {
            result3=item1;
            System.out.println("shirt:$"+item1);

        } else if (select3==2) {
            result3=item2;
            System.out.println("pants: $"+item2);
        }else if (select3==3) {
            result3=item3;
            System.out.println("dress: $"+item3);
        }else if (select3==4) {
            result3=item4;
            System.out.println("hat: $"+item4);
        }else if (select3==5) {
            result3=item5;
            System.out.println("shoes: $"+item5);
        } else {
            System.out.println("invalid");
        }


        if ((result1+result2+result3)>200) {
            System.out.println("Total Amount with %20 discount : $" +(result1 + result2 + result3) * 0.8);
        }else if ((result1+result2+result3)>150 && ((result1+result2+result3)<=200)){
            System.out.println("Total Amount with %15 discount : $" +(result1+result2+result3) * 0.75);
        }else if ((result1+result2+result3)>100 && ((result1+result2+result3)<=150)){
            System.out.println("Total Amount with %5 discount : $" +(result1+result2+result3) * 0.95);
        } else {
            System.out.println("no discount");
        }


    }


}