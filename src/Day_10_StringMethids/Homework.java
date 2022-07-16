package Day_10_StringMethids;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        //Hello Everyone, Here is another Homework for you to work on for the String Methods.

        // 1. First create one string and copy paste below paragraf.
        // 2. And make modifications on the given paragraph listed below.

        //Make sure to create multiple string with each sentence from given paragraph
        //Make sure each sentence start with upper case letter.
        //Make sure city name start with the capital letter.
        //Make sure the rest of the letters are lower case.
        //Make sure to change the name, age and city information based on your information
        //make sure to get rid of the empty spaces in front and end of the sentences.

        //after you make the modification check each sentense’s length
        //Print each sentence and make sure they are correctly modified.
        //Print 1st, 4th and 5th indexed characters for each sentence
        //At the end combine all the sentence to get proper paragraph with modified sentences

        // hello my name is <yourname>.
        // I am <yourage> years old.

        Scanner scan=new Scanner(System.in);

        String paragraph = " hello my name is Sevgi Alkan.       i am 41 years old.  i live in Toronto. I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. " +
                "I have experience in EducatION, energy,finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   " +
                "i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.";

        System.out.println("Please Enter your name");
        String name=scan.next();
        System.out.println("Please Enter your age");
        String age=scan.next();
        System.out.println("Please Enter your city");
        String city=scan.next();

        String nameResult= name.substring(0,1).toUpperCase() + name.substring(1);
        String cityResult= city.substring(0,1).toUpperCase() + city.substring(1);

        String sentence1 = " hello my name is "+nameResult+".";
        String sentence2 = "       i am 41 years old.";
        String sentence3 = "  i live in " +cityResult+ ".";
        String sentence4 = " I have been in IT industry for about 6 years.";
        String sentence5 = " I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. ";
        String sentence6 = " I have experience in EducatION, energy,finance and some manY Other AREAs.";
        String sentence7 = " i HAve scrum master and Oracle java Programmer certificates.";
        String sentence8 = "   i love JaVA.";
        String sentence9 = "   I designed and DEVELoped many automation test cases using BDD FRamework. ";

        String sentence1n = sentence1.replace('h', 'H').trim();
        System.out.println((sentence1n) + ("length is = " + sentence1n.length()));

        String sentence2n = sentence2.replace('i', 'I').trim();
        System.out.println((sentence2n) + ("length is = " + sentence2n.length()));

        String sentence3n = sentence3.replaceFirst("i", "I").trim();
        System.out.println((sentence3n) + ("length is = " + sentence3n.length()));

        String sentence4n = sentence4.trim();
        System.out.println((sentence4n) + ("length is = " + sentence4n.length()));

        String sentence5n = sentence5.trim().toLowerCase().replaceFirst("i", "I").replaceFirst("i", "I");
        System.out.println((sentence5n) + ("length is = " + sentence5n.length()));

        String sentence6n = sentence6.trim().toLowerCase().replaceFirst("i", "I");
        System.out.println((sentence6n) + ("length is = " + sentence6n.length()));

        String sentence7n = sentence7.replace('i', 'I').trim().toLowerCase().replaceFirst("i", "I");
        System.out.println((sentence7n) + ("length is = " + sentence7n.length()));

        String sentence8n = sentence8.replace('i', 'I').trim().toLowerCase().replaceFirst("i", "I");
        System.out.println((sentence8n) + ("length is = " + sentence8n.length()));




        String s1 = "First sentence 1st char is " + (sentence1n.charAt(0)) + ",4st char is " + (sentence1n.charAt(3)) + ",5st char is " + (sentence1n.charAt(4));
        String s2 = "Second sentence 1st char is "+sentence2n.charAt(0)+ ",4st char is " +sentence2n.charAt(3)+ ",5st char is "+sentence2n.charAt(4);
        String s3 = "Third sentence 1st char is "+sentence3n.charAt(0)+ ",4st char is " +sentence3n.charAt(3)+ ",5st char is "+sentence3n.charAt(4);
        String s4 = "Fourth sentence 1st char is "+sentence4n.charAt(0)+ ",4st char is " +sentence4n.charAt(3)+ ",5st char is "+sentence4n.charAt(4);
        String s5 = "Fifth sentence 1st char is "+sentence5n.charAt(0)+ ",4st char is " +sentence5n.charAt(3)+ ",5st char is "+sentence5n.charAt(4);
        String s6 = "Sixth sentence 1st char is "+sentence6n.charAt(0)+ ",4st char is " +sentence6n.charAt(3)+ ",5st char is "+sentence6n.charAt(4);
        String s7 = "Seventh sentence 1st char is "+sentence7n.charAt(0)+ ",4st char is " +sentence7n.charAt(3)+ ",5st char is "+sentence7n.charAt(4);
        String s8 = "Eighth sentence 1st char is "+sentence8n.charAt(0)+ ",4st char is " +sentence8n.charAt(3)+ ",5st char is "+sentence8n.charAt(4);

        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n"+s7+"\n"+s8);


        System.out.println(sentence1n + sentence2n + sentence3n + sentence4n
                + sentence5n + sentence6n + sentence7n + sentence8n);

    }

    }

