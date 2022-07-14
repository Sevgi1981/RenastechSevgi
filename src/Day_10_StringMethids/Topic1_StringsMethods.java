package Day_10_StringMethids;

import org.omg.CosNaming.IstringHelper;

public class Topic1_StringsMethods {
    public static void main(String[] args) {


        // substring()	          Extracts the characters from a string,
        //                      beginning at a specified start position,
        //                      and through the specified number of character	                    String

        String str1 = "LokmanEkin";
        String substr1 = str1.substring(6);  // it begins to print 6.character
        System.out.println(substr1);
        String substr2 = str1.substring(3,6);         //beginning index is included but ending index not include
        System.out.println(substr2);                  // if 0 whole name will print
        String substr4 = str1.substring(3, str1.length()); // if +1 it will error becuase there is no 11 // string length is 10
        System.out.println(substr4);


        // toLowerCase()	      Converts a string to lower case letters	                        String

        String str2= "SevGi";
        String lowstr1 = str2.toLowerCase();
        System.out.println(lowstr1);

        System.out.println(str2.toLowerCase());

        //toUpperCase()	      Converts a string to upper case letters	                        String

        String upstr1= str2.toUpperCase();
        System.out.println(upstr1);

        //trim()	              Removes whitespace from both ends of a string	                String

        String str3= "Cevdet ";  // if the space between the name it wont remove the space
        String trstr3= str3.trim();
        System.out.println(trstr3);




    }
}
