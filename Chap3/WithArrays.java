package Chap3;

import java.util.Arrays;

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


        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // OUTPUT 3
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        //using a loop to set the elements in an array
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
          nums[i] = i + 5;
        System.out.println(Arrays.toString(nums));

        //sorting arrays
        int[] numb = { 6, 9, 1 };
        Arrays.sort(numb);
        for(int number : numb)
          System.out.print(number + " ");
        System.out.println(Arrays.toString(numb));

        int[] unsortedNum = {8,6,2,4};
        Arrays.sort(unsortedNum); // beacuse we have sorted we find the varios index of numbers
        System.out.println(Arrays.toString(unsortedNum));
        System.out.println(Arrays.binarySearch(unsortedNum, 6)); // index of 6 which is 2
        /*
         * we do not have 3 in our arrays but since it is sorted, 3 would have been at index 1
         * so we negate 1 and subract 1 ie -1-1=-2.
         */
        System.out.println(Arrays.binarySearch(unsortedNum, 3)); //outputs -2

        //an unsorted array will have an unpredictable output.
        int numbe[] = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbe, 2));
        System.out.println(Arrays.binarySearch(numbe, 3));

        //2D array (array of arrays)
        String [][] rectangle = new String[3][2];
        rectangle[0][0] = "Lisa";
        rectangle[0][1] = "Kevin";
        rectangle[1][0] = "Lisa";
        rectangle[1][1] = "Kevin";
        rectangle[2][0] = "Lisa";
        rectangle[2][1] = "Kevin";
        System.out.println();

        //2D array of primitives and variable size
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
        System.out.println(differentSize.length); // ouputs 3
        System.out.println(differentSize[1][0]); // should output 3
    }
    
}
