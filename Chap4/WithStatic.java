package Chap4;

public class WithStatic {

    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public void third() 
    { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
        
        //third(); // DOES NOT COMPILE beacsue the method is not static so it must use an instance to be called  or we make the method static
        WithStatic s  = new WithStatic();
        //s.third(); // now this woks becasue we have used a refrence to call it
        new WithStatic().third(); // another way to call the non static method 

    } 
}