package Chap4.Quest;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        
    }
     //q1
    // A. default
    // B.final
    // C.private
    // D.Public
    // E.String
    // F.zzz:
    //default void method(){} // deafult as a method access modifier is allowed only in interfaces
    // _______void method(){}  answer B C D

    //q2
    // final static void method4(){} A
    //public final int void method(){} // you can have only one return type here
    //private void int method() { } // same here only one return type needed here
    // static final void method3() { } D
    //void final method() {} // must have return type before method
    //void public method() { } // must start with access modifier if specified  answer A D

    //Q3  A C D
    //public void methodA() {return;} // returns nothing so valid and compiles
    // public void methodB() {return null;} // returns a value so not correct, void retuns nothing
    //public void methodD() {} // compiles
    //public int methodD() {return 9;} //compiles
    //public int methodE() {return 9.0;} // cannot convert from double to int directly so does not compile
    //public int methodF() {return;} // must return it, does not compile
    //public int methodG() {return null;} // must return int, cannot convert from null to int

    //q4 A B G
    // public void moreA(int... nums) {} // used once compiles
    // public void moreB(String values, int... nums) {} //used once and last so compiles
    // public void moreC(int... nums, String values) {} //used second does not compile
    // public void moreD(String... values, int... nums) {} // used twice does not compile
    // public void moreE(String[] values, ...int nums) {} // dots in wrong direction shopuld be int... then it compiles
    // public void moreF(String... values, int[] nums) {} // used first does not compile
    // public void moreG(String[] values, int[] nums) {} // valid two array parameter input so compiles

    //Q5 D G
    // public int howMany(boolean b, boolean... b2) {
    //     return b2.length;
    //     }
    // howMany(); d// does not compile beacuse it is suposed to take in a paramter
    // howMany(true); // compiles , the vargas is just initialised so outputs 0 since no element is inside
    // howMany(true, true); // outputs 1
    // howMany(true, true, true); //outputs 2
    // howMany(true, {true}); does not compile. {true}, {}, or {true,true} is not a valid argument passed to varargs
    // howMany(true, {true, true}); // not compiles
    // howMany(true, new boolean[2]); // compiles and an array of fixed size 2 is passed to varargs so outputs 2

    //6 B D
    // A. Package private access is more lenient than protected access. // false 
    // B. A public class that has private fields and package private methods is not visible to
    // classes outside the package. // true
    // C.You can use access modifiers so only some of the classes in a package see a particular
    // package private class. // false
    // D.You can use access modifiers to allow read access to all methods, but not any instance
    // variables. // true
    // E.You can use access modifiers to restrict read access to all classes that begin with the
    // word Test. // fasle

    //Q7  B C D E F

    //Q8
    // Encapsulation uses package private instance variables. // no it uses the private access modifier
    // Encapsulation uses private instance variables. // true
    // Encapsulation allows setters. // true
    // Immutability uses package private instance variables. // true
    // Immutability uses private instance variables.  // true
    // Immutability allows setters. // false

    //Q9 A C E
        // A.public boolean getCanSwim() {
        // return canSwim;}
        // B.public boolean canSwim() {return numberWings;}
        // C.public int getNumWings() {return numberWings;}
        // D.public int numWings()return numberWings;}
        // E.public void setCanSwim(boolean b) 

    //Q10 
    // swing swing 10 B
    
    //Q11 
    


}
