package Chap5.polymorphism;

public class VirtualMethod1 {
    //virtual method
    public String getName() {
        return "Unknown";
    }
    //virtual method
    public void displayInformation() {
        // the getname() call made in this class 
        System.out.println("The bird name is: "+getName());
    }
}
