package Chap4.Overloading;


public class WithOverloadMethod {

//all valid method overloads
public void fly(int numMiles) { }
public void fly(short numFeet) { System.out.println("short");}
public boolean fly() { return false; }
void fly(int numMiles, short numFeet) { }
public void fly(Integer numMiles) { }
public void fly(short numFeet, int numMiles) throws Exception { }

//overloading vargags
public void fly(int[] length) { }
// public void fly(int... length) { } // DOES NOT COMPILE both methods haave same parameters so code will not compile

//not a valid method oveload
//public int fly(int numMiles) { }  // DOES NOT COMPILE because the parameters are same as another method

public static void main(String[] args) throws Exception {
    WithOverloadMethod method = new WithOverloadMethod();
    //we are typecasting our input to short so itt calls the short method
    method.fly((short)1);// this call bring the fly method to compare the type of variable input to know which method to call
    method.fly(1); // this calls the int methods since input type is an integera
    method.fly(new int[] { 1, 2, 3 }); // calls fly method whivh takes an array as input parameter
    
    }
}
