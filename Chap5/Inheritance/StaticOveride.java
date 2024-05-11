package Chap5.Inheritance;

public class StaticOveride {

    public static void eat() { // static meaning it should be hidden
        System.out.println("Bear is eating");
    }

    public static void sneeze() { // same here
        System.out.println("Bear is sneezing");
    }

    public void hibernate() { // non static meaning it should be overwritten and not hidden
        System.out.println("Bear is hibernating");
    }

    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
    //final methods cannot be ovewridden
    public final boolean hasFeathers() {
        return true;
    }
}
