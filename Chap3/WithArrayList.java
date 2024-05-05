package Chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WithArrayList {
    public static void main(String[] args) {
        //declaring an array list
        ArrayList<String> safer = new ArrayList<>();

        safer.add("sparrow");
        //safer.add(Boolean.TRUE);// DOES NOT COMPILE beacsue arraylist if of type string not boolean
        System.out.println(safer);

        //like sringbuilder the arraylist is dynamic
        safer.add(1,"bell"); // add at index 1 the string bell
        safer.add(2,"hello");
        System.out.println(safer);
        // safer[0]; can do this only with arrays not arraylist

        safer.set(2,"Spoon"); // change what is at index two to spoon
        safer.isEmpty(); //outputs faslse because it is not empty
        //safer.clear(); // remooves everything from the arraylist
        safer.contains("Spoon"); // outputs to true because it contains a string Spoon
        safer.get(1); // gets element at index one
        //safer.remove(1); // removes element at index 1
        System.out.println(safer+" "+safer.isEmpty()+" "+safer.size());

        /*
         * parseInt - convert string to primitive
         * valueOf - convert string to wrapper class
         */

        int primitive = Integer.parseInt("123"); // converts string to primitive integer
        Integer wrapper = Integer.valueOf("123"); // converts string to an integer wrapper class

        // int bad1 = Integer.parseInt("a"); // throws NumberFormatException
       //Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

       //convert arraylits to array
       List<String> list = new ArrayList<>();
       list.add("hawk");
       list.add("robin");
       Object[] objectArray = list.toArray(); // Converts the arraylist to an array but of type object, we might not want that
       System.out.println(objectArray.length);
       String[] stringArray = list.toArray(new String[0]); // converts arraylist to an array of type string

       //convert array to arraylist
       String[] array1 = { "hawk", "robin" }; // [hawk, robin]
       List<String> list1 = Arrays.asList(array1); // returns fixed size list arrayList
       System.out.println(list.size()); // 2
       list1.set(1, "test"); // updates both array1 and list1 // [hawk, test]
       array1[0] = "new"; // [new, test] // also upates list1 to same thing
       //list1.remove(1);// throws UnsupportedOperation Exception since we have a fixed size array list

       //sort arraylist
       List<Integer> intergers1 = new ArrayList<>();
       intergers1.add(1);
       intergers1.add(9);
       intergers1.add(7);
       intergers1.add(2);
       intergers1.add(10);
       System.out.println("unsorted arraylist: "+intergers1);
       Collections.sort(intergers1);
       System.out.println("sorted arraylist: "+intergers1);
    }
}
