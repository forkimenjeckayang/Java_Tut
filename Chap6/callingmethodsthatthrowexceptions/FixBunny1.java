package Chap6.callingmethodsthatthrowexceptions;

public class FixBunny1 {
    public static void main(String[] args) throws NoMoreCarrotsException{ // declared
        eatCarrot();// COMPILES NOW
    }
    /*
     * this method eatCarrot indicates it throws an execptions(checked exception)
     * which must be handled or declared whenever the method is used.
     */
    private static void eatCarrot() throws NoMoreCarrotsException {
    }
}
