package Chap5.Quest;

public class Reptile1 extends Reptile {
    // the method lauEggs is final in parent class and it cannot be overwriden so a compiler error shows
    public void layEggs() { System.out.println("Lizard laying eggs"); }

    public void dive(int depth) { System.out.println("Orca diving"); }
}
