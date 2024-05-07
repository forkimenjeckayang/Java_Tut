package Chap4.Encapsulation;

public class Swan {
    private int numberEggs; // we have a private instance variable onlyy code within the class can read or write to it
    public int getNumberEggs() { // getter
        return numberEggs;
    }
    public void setNumberEggs(int numberEggs) { // we define a rule on how to set the instance varibale  using a setter method(mutuator method
        if (numberEggs >= 0) 
        this.numberEggs = numberEggs;
    }
}
