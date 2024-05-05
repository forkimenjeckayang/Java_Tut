package Chap4;

public class WithMethodName {
public void walk1() { } // valid name
//public void 2walk() { } // DOES NOT COMPILE invalid cannot start with number
//public walk3 void() { } // DOES NOT COMPILE return type wrong, method name cannot be a keyword. return type comes before method name
public void Walk_$() { }
//public void() { } // DOES NOT COMPILE method name cannot be a keyword
}
