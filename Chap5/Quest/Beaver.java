package Chap5.Quest;

public class Beaver extends Rodent {
    /*
     * fails to compile because the return types of the method here is different
     * also the method in Rodent is declared static meaning it can ony be hidden here in Beaver by use of static
     * unless an overload before we can change return type
     */
    public Number chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
        }

    // It fails to compile because the return types are not covariant.
    // It fails to compile because the return types are not covariant.
    
}
