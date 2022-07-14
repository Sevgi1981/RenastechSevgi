package Day_9_Strings;

public class Topic1_Strings {
    public static void main(String[] args) {
/*

        in java, string is an object that represents a sequence of characters.
        The java.Lang.String class is used to create a string object.
        How to create a string object?
        There are two ways to create String object:

        1.By string literal
        String= str="Class"; // it is into the pool memory
        String-str2="Class"; // java is not creating new "Class" object into the pool


        2.By new keyword
        String str1= new String("Class1); // it is heap memory




        // create a string object 1.By string literal

        /*
        Java String literal is created by using double quotes.
        For example:


        String str1="Hello";
        Each time you create a string literal, the JVM (java vartial machine) checks the "string constant pool" first.
        if the string already exists in the pool, a reference to the pooled instance is returned.
        if the string doesnt exist in the pool, a new string instance is created and placed in the pool.
        For example:
         */
        //in java string objects are immutable ( object unchangeable- cant be modify).

        String str1="Hello";
        String str2="Hello";
        str2="Helo";
        String str6="Helo";
        String str7=new String("Helo");

        System.out.println(str2);
        System.out.println(str2==str6); // true because location is same
        System.out.println(str7==str6); //false because location is different

    }
}
