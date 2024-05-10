package Chap4.Quest;

import Chap4.Quest.rope.Rope2; //import class
import static Chap4.Quest.rope.Rope2.*; //import static members from class

public class RopeSwing {

    private static final String leftRope;
    private static final String rightRope;
    // private static final String bench; // since it is static must be  initialized here or within static  block and not in main method or instance block
    private static final String name = "name";

    private static Rope2 rope1 = new Rope2();

    private static Rope2 rope2 = new Rope2();

    static {
        leftRope = "left";
        rightRope = "right";
        }
        // static {
        // name = "name";
        // rightRope = "right";
        // }

    {
        System.out.println(rope1.length);
        
    }
    public static void main(String[] args) {
        // String bench = "yugyuu";
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);// output 8
    }
}
