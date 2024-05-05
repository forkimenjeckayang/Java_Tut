package Chap4.Overloading;

public class OrderOverload {
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
    public static void main(String[] args) {
        /*
         * method first looks for a method which strictly takes a one parameter String input 
         * and that will be the method returning one
         */
        System.out.println(glide("a"));
        /*
         * here the method takes two strings as input so it looks for a method which strictly takes 
         * two parameters of types string first and that will be the method returning four
         */
        System.out.println(glide("a", "b"));
        /*
         * finally it looks for a method taking three paramets string as input and the best suitable option 
         * will be the varags method returning 2s
         */
        System.out.println(glide("a", "b", "c"));
    } 
}
