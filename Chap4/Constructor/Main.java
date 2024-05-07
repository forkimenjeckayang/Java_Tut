package Chap4.Constructor;

public class Main {
    public static void main(String[] args){
        Bunny b1 = new Bunny(); // empy constructor eith no args is called // oyputs: i am the constructor
        Bunny b2 = new Bunny("red"); // constructorwith argsis called and initoilaised // outputs i am the color: red
        Bunny b3 = new Bunny(10, 20); // sets color to white, lenght to 10 and height to 10
        
    }
}
