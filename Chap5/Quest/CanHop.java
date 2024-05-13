package Chap5.Quest;

public interface CanHop {
    abstract int getNumberOfSections();
    int amount = 10; // compiler converts to public static final
    /*
     * A static method defined in an interface is 
     * not inherited in any classes that implement the interface.
     * static methods in an interface cannot be abstract so if static provide an implementation
     */
    public static void eatGrass();
    //abstract methods do not require a body 
    public int chew() {
        return 13;
    }
    public int chew1(); // now this works
    public static void eatGrass1(){
        System.out.println("Now this works");
    }
    void fly(); //  converts to public abstract
    public abstract Object getWindSpan(); 
}
