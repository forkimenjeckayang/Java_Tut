package Chap4;
import static java.util.Arrays.asList; // imports a static method asList from the Arrays class

import java.util.ArrayList;

public class Immutable {
    private static final int NUM_BUCKETS = 45;
    private static final int NUM_SECONDS_PER_HOUR;
    private static final ArrayList<String> values = new ArrayList<>();
//STATIC INNITIALIZERS
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
    public static void main(String[] args) {
        //Immutable.NUM_BUCKETS = 5; //Cannot compile because we declared it final meaning it is a constant and cannot change
        values.add("hello");
        values.set(0, "hi");// we can access the values varibale and add and set things but cannot assign values to something since it is immutable


    }
}
