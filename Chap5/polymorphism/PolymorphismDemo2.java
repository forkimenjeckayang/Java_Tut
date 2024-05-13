package Chap5.polymorphism;

public class PolymorphismDemo2 extends PolymorphismDemo implements PolymorphismDemo1{

    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {

        // the type of demo here is PolymorphismDemo so i can access the methods and instance vars of this class
        PolymorphismDemo2 demo = new PolymorphismDemo2();
        System.out.println(demo.age); 

        PolymorphismDemo1 demo1 = new PolymorphismDemo2(); // or
        // the type of demo12 is PolymorphismDemo1 so i can access the methods and instance vars of the class type
        PolymorphismDemo1 demo12 = demo; // works since demo is same as new PolymorphismDemo2()

        //PolymorphismDemo2 dm = demo1; // cannot convert from PolymorphismDemo1 to PolymorphismDemo2 since PolymorphismDemo2 came from PolymorphismDemo1
        PolymorphismDemo2 dm = (PolymorphismDemo2)demo1; // object casting from PolymorphismDemo1 to PolymorphismDemo2

        //System.out.println(demo12.age); // cannot compile because age is in the PolymorphismDemo2 class and i am using a var from PolymorphismDemo1 instead

        System.out.println(demo1.isTailStriped()); // using var of the interface object to access the method..

        PolymorphismDemo demo2 = new PolymorphismDemo2(); // or
        PolymorphismDemo demo22 = demo; // works since demo is same as new PolymorphismDemo2()
        System.out.println(demo2.hasHair());
    }

    /*
     * The most important thing to note about this example is that only one object, demo, is 
     * created and referenced. The ability of an instance of demo to be passed as an instance of an
     * interface it implements, PolymorphismDemo1, as well as an instance of one of its superclasses PolymorphismDemo,
     * is the nature of polymorphism.
     */
    
}
