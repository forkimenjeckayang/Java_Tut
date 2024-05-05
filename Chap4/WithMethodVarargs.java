package Chap4;

public class WithMethodVarargs {
public void walk1(int... nums) { } // used only once so valid
public void walk2(int start, int... nums) { } // used only once and as last param so valid
//public void walk3(int... nums, int start) { } // DOES NOT COMPILE used aas first param so not valid
//public void walk4(int... start, int... nums) { } // DOES NOT COMPILE used twice so not valid and also as first param in a two param method

}
