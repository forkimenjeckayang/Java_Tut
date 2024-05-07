package Chap4.Constructor;

public class MoreInitializationOrder {

    static { add(2); } // initialized first
    static void add(int num) { System.out.print(num + " "); }

    MoreInitializationOrder() { add(5); } // initialized sixth

    static { add(4); } //initialized second

    { add(6); } // initialized fourth

    static { new MoreInitializationOrder(); } // initialized third and creates an an instance to start accessing instance variables and instance initialization blocks but that's after executing the main method

    { add(8); } // initialized fifth
    public static void main(String[] args) { 
        System.out.println("i am called after the statics");  // called last here becasue the static intialises the intsnace blocks so it finishes what the static started before coming to the main method
        /*
         * should output
         * 2,4,6,8,5 i am called after the statics
         */

    } 
}

