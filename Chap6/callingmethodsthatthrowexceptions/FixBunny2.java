package Chap6.callingmethodsthatthrowexceptions;

public class FixBunny2 {
    
    public static void main(String[] args) {
        /*
         * now this approach handles the exception rather than declaring the exception will be throwns
         */
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e){
            System.out.println("EXception handled");
        }
    }
    /*
     * this method eatCarrot indicates it throws an execptions(checked exception)
     * which must be handled or declared whenever the method is used.
     */
    private static void eatCarrot() throws NoMoreCarrotsException {
    }
}
