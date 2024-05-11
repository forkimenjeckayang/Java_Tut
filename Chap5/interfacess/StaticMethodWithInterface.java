package Chap5.interfacess;

public interface StaticMethodWithInterface { 
    /*
     * same as default, a static method in an interface can have a body defined
     * it can be accessed without an instance of the class using the Hop.getJumpHeight() syntax.
     * compiler automatically inserts the access modifier public 
     */
    static int getJumpHeight() {
        return 8;
    }

}
