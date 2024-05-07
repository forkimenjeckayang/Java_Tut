package Chap4.Constructor;

public class Bunny {

    private String color;
    private int height;
    private int length;

    // here is the constructor becasue it is same naeme as the class nd has no return type.
    //just access modifier and method name
    public Bunny() {
        System.out.println("i am the constructor");
        }
    /*
     * this is still a constructor but now with a paramter. It is valid because we know
     * method overloading
     */
    public Bunny(String color) {
        /*
        tells java i want the instance variable color to be set to whatevr paramter 
        is passed to the constructor,use "this.color" in naming collision ie if instnace 
        variable and paramter name are thesame. 
        */ 
        this.color = color;
        System.out.println("i am the color: " + color);
    }
    public Bunny(int length, int theHeight) {
        length = this.length; // backwards – no good! but is valid
        height = theHeight; // fine because no naming collision
        this.color = "white"; // fine, but redundant we could just say color = "white" still good
        }
}
