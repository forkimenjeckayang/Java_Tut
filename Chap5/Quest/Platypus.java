package Chap5.Quest;

public class Platypus extends Mammal {
    /*
     * cannot compile because the Mamaml class does  not have a no args constructor 
     * and so we must explicitly call the constructor in Mammal class  in our Platypus constructor with super()
     */
    public Platypus() {
        // super(1);
        System.out.print("Platypus");
    }
    public static void main(String[] args) {
        new Mammal(5);
    }
}
