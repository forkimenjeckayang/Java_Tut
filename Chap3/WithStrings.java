package Chap3;

public class WithStrings {
    public static void main(String[] args) {
        System.out.println("a" + "b");
        System.out.println(1+2);
        System.out.println(1+"a");
        System.out.println("1"+"2");

        int three = 3;
        String four = "4";
        System.out.println(1+2+three + four); //output "64"

        String s = "1"; // here s is 1
        s += "2"; // s = s+"2" = "1"+"2" = 12
        s += 3; // s = s + "3" = "12" + "3" = 123
        System.out.println(s); // outpput 123

        String s1 = "1";
        String s2 = s1.concat("2"); //string class is immutable ie s2 has been created here
        s2.concat("3"); // we are trying to mmodify s2 but it wont take effect since the string has already been created
        System.out.println(s2);

        @SuppressWarnings("unused")
        String name = "Fluffy"; // use string poo(a place in the JVM where string literals like this are kept)
        @SuppressWarnings("unused")
        String name2 = new String("Fluffy"); // create new string object and do not use the string pool

        String  lastName = "Akwichek";
        lastName.length(); // outputs 8
        lastName.charAt(0); //outputs A
        lastName.charAt(4); // outputs c
        //lastName.charAt(8); // error  beacuse there is no index 8, remember indexing starts from 0
        System.out.println(lastName.length()+"" +lastName.charAt(4)+"" +lastName.charAt(0));

        lastName.indexOf("Ai"); // outputs -1 cuz no match is found
        lastName.indexOf("ek"); // ouputs 6
        lastName.indexOf('k',4); // find index of K but start looking from index 4
        System.out.println(lastName.indexOf("Ai")+"" +lastName.indexOf('k',4) + "" +lastName.indexOf("ek"));

        lastName.substring(4); // creates substring starting at index 4 so output is check
        lastName.substring(0,4); // index 4 will not be included when string is built. so will stop at index 4 so output is Akwi
        lastName.substring(lastName.indexOf('c')); // outputs check since it will build substring starting at index 4
        System.out.println(lastName.substring(lastName.indexOf('c')) + " "+ lastName.substring(0,4));

        lastName.toLowerCase(); // converts string to lower case
        lastName.toUpperCase(); // converts string to upper case
        System.out.println(lastName.toLowerCase() + " " + lastName.toUpperCase());

        String letter = "ABC";
        String letter2 = "abc";
        System.out.println(letter.equals(letter2)); // checks is two strings have thesame characters in thesame order
        System.out.println(letter2.equals(letter2)); // same check here
        System.out.println(letter2.equalsIgnoreCase(letter)); // does same check but ignores the case of the chacracters of the strings
        
        lastName.startsWith("Ak"); // outputs to true becuase string starts with them
        lastName.endsWith("jk"); // outputs false becasue string foes not end with those two characters
        lastName.contains("ch"); // outputs to true since string contains ch
        lastName.contains("cl"); // outputs false since one of the characters l is nopt found 
        System.out.println(lastName.startsWith("Ak"));
        System.out.println(lastName.endsWith("ek"));
        System.out.println(lastName.contains("cl"));

    



        

    }
}
