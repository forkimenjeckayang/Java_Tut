package Chap6.usingatrystatement;

public class TryStatement {

    void explore() {
        try {
            fall(); // calls the fall method
            System.out.println("never get here"); //we will never get to this line
        } catch (RuntimeException e) { // we enter the catch block to handle the exception
            getUp();
        }
        seeAnimals(); // after that code execution continues normally
    }
    void fall() { 
        throw new RuntimeException(); // method throws an exception
    }
}
