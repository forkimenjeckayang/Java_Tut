package Chap4;

public class WithMethodSpecifies {

public void walk1() {}
public final void walk2() {}
public static final void walk3() {}
public final static void walk4() {}
// public modifier void walk5() {} // DOES NOT COMPILE modifier not a valid specifier
//public void final walk6() {} // DOES NOT COMPILE we must have return type then method name
final public void walk7() {}


}
