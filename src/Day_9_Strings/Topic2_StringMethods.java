package Day_9_Strings;

public class Topic2_StringMethods {
    public static void main(String[] args) {

        /*
        Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

         */

        // charAt()    Returns the character at the specified index (position)    char

        String str="Renas";
        char firstL = str.charAt(0);
        System.out.println(firstL);
        System.out.println(str.charAt(3));

            // concat ()       Appends (ilistirmek) a string to the end of another string

        String str1="name0";
        String str2 = "name1";
        String str6="Ziya";
        String str3=str1.concat(str2);
        String str5= str1.concat(" " +str6.concat(" "+str2)); // order is important
        System.out.println(str5);

        System.out.println(str3);

        String str4= str1 + str2;  // name0name1
        System.out.println(str4);

        System.out.println("**************");

        // contains ()        Checks whether a string contains a sequence of characters          boolean

        String name1="Gulay";
        boolean YN= name1.contains("ulay");
        System.out.println(YN); // true

        System.out.println("**************");
        // endsWith ()       Checks whether a string ends with the specified character(s)    boolean
        // if your string ends with given condition it will be true
        // if it is not then you will have false

        boolean YN1=name1.endsWith("gulay");
        System.out.println(YN1);

        name1.endsWith("ay");
        System.out.println(name1.endsWith("ay")); //it is the same thing with above

        System.out.println("*************");

        // equals ()            Compares two strings. Returns true if the strings are equal and false if it is not  boolean
        // equals method will only care exact math value not the memory (object type)

        String name2= "Sam";
        String name3= "Jason";

        boolean YN3=name2.equals(name3);
        System.out.println(YN3);
        System.out.println(name2 == name3);// it is same thing


        System.out.println("*************");
        // equalsIgnoreCase()   Compare two strings, ignoring case considerations                            boolean

        System.out.println(name2.equalsIgnoreCase(name3)); // true

        System.out.println("indexOf*********");

        // indexOf()           Returns the position of the first found occurrence of specified characters in a string  int

        String name5= "banana";
        int ind= name5.indexOf('n');
        System.out.println(ind);

        System.out.println("*************");

        // isEmpty()           Checks whether a  string is empty or not boolean

        String emp= ""; // if " " it is false // if "" it is true // if emp; will be error
        System.out.println(emp.isEmpty());

        // lastIndexOf()   Returns the position of the first found occurrence of specified characters in a string  int
        int lst= name5.lastIndexOf('a');
        //banana  // 012345
        System.out.println(lst);



        // length()    Returns the length of a specified string             int
        System.out.println("*************");

        String str100= "ststrkhkdkdkfmfmfm";
        int count=str100.length();
        System.out.println(count);

        //replace ()      Searches a string for a specified value and returns a new string where the specified values are replaced  String

        System.out.println("************");

        String name12= "GulayGGGGG";
        String name13= name12.replace("lay", "n");
        System.out.println(name13);


        // replaceFirst()   replaces the first occurrence of a substring that matches the
        //                      given regular expression with the given replacement	            String

        System.out.println(name13.replaceFirst("G", "T"));  // it will change only first G

        //startsWith() Checks whether a string starts with specified characters	        boolean

        System.out.println("************");

        String name16= "Alican";
        boolean YN5 = name16.startsWith("Al");
        System.out.println(YN5);


        


    }
}
