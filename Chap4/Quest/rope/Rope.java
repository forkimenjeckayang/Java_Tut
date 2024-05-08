package Chap4.Quest.rope;

public class Rope {
    public static int LENGTH = 5;
    static {
        LENGTH = 10;
    }
    public static void swing() {
        System.out.print("swing ");
    }
    public void climb() {
        System.out.println("climb ");
    }
    public static void play() {
        swing();
        Rope r = new Rope();
        r.climb(); // this works because climb is non static and hence needs an instance to be called
        // climb(); //  fails because Static method cannot call a non static method direcrly unless via an instance 
    }
}
