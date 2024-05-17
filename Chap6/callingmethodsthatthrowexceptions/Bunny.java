package Chap6.callingmethodsthatthrowexceptions;

public class Bunny {
    public static void main(String[] args) {
        /*
         * this does not compile because the method eatCarrot() throws and exception
         * which is not handled or declared in the main method.
         */
        eatCarrot();// DOES NOT COMPILE
    }
    /*
     * this method eatCarrot indicates it throws an execptions(checked exception)
     */
    private static void eatCarrot() throws NoMoreCarrotsException {
    }
}
