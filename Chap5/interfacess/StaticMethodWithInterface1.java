package Chap5.interfacess;

public class StaticMethodWithInterface1 implements StaticMethodWithInterface {
    public void printDetails() {
        //System.out.println(getJumpHeight()); // method is static so needs to be called using the interface name
        System.out.println(StaticMethodWithInterface.getJumpHeight()); // simple
    }

    /*
     * It follows, then, that a class that implements two interfaces containing static methods
     * with the same signature will still compile at runtime, because the static methods are not 
     * inherited by the subclass and must be accessed with a reference to the interface name.
     */
}
