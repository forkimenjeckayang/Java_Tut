package Chap5.interfacess;

public interface CanSwim {
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}
/*
 * public interface CanSwim {
 * public static final int MAXIMUM_DEPTH = 100;
 * public static final boolean UNDERWATER = true;
 * public static final String TYPE = "Submersible";
 * }
 * 
As we see in this example, the compiler will automatically insert public static final to 
any constant interface variables it fi nds missing those modifiers. Also note that it is a common 
coding practice to use uppercase letters to denote constant values within a class.
Based on these rules, it should come as no surprise that the following entries will not
compile:

public interface CanDig {
private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
public static String TYPE; // DOES NOT COMPILE
}

The first example, MAXIMUM_DEPTH, doesn’t compile because the private modifier is used,
and all interface variables are assumed to be public. The second line, UNDERWATER, doesn’t
compile for two reasons. It is marked as protected, which confl icts with the assumed
modifier public, and it is marked as abstract, which conflicts with the assumed modifier
final. Finally, the last example, TYPE, doesn’t compile because it is missing a value. Unlike
the other examples, the modifiers are correct, but as you may remember from Chapter 4,
you must provide a value to a static final member of the class when it is defined.
 */
