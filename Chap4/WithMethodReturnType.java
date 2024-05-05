package Chap4;

public class WithMethodReturnType {
    
public void walk1() { }
public void walk2() { return; } // optionally putting return statement for void method return type
public String walk3() { return ""; }
// public String walk4() { } // DOES NOT COMPILE no return statement given in {} so error
//public walk5() { } // DOES NOT COMPILE no return type  so does not compile 
//String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE it will not always return a string so will lnot compile


}
