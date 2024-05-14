package Chap6.usingatrystatement;

public class CatchStatement {
    void explore() {
        try {
            seeAnimals(); // calls seeAnimals() method
            fall(); // after calls fall() method which throws an exception so we move to the catch clause
        } catch (RuntimeException e) { // exception handled  here and we move to the finally block
            getHugFromDaddy();
        } finally {
            seeMoreAnimals(); // executes and program continues
        }
        goHome(); // after that code execution continues normally
    }
    void fall() { 
        throw new RuntimeException(); // method throws an exception
    }
}
