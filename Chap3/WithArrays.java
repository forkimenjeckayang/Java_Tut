package Chap3;

public class WithArrays {
    public static void main(String[] args) {
        /*
         * int numbers4 [] = new int[3]; aslo works
         * numbers4 is a variable of type int[]
         */

        //an array of prmitives
        int[] numbers1 = new int[3]; // creating an array with size 3
        int [] numbers2 = new int[] {1, 2, 3, 4, 5}; // creating an array with size 5 and specifying the values
        int[] numbers3 = {1, 2, 3, 4, 5}; // anonymous array because you dont specify type and size
        System.out.println(numbers1[0]);
        System.out.println(numbers2[0]);
        System.out.println(numbers3[2]);

        //an array of objects
        String [] bugs = { "cricket", "beetle", "ladybug" }; // string array
        String [] alias = bugs; 
        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString());// tries to print the bugs array but prints it's value in memory instead but a better method prints arrays nicely

        //String names[]; since we have not initialized this, it is just a refrence variable which is null.This line nerver instanciated and array

    }
    
}
