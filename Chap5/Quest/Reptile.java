package Chap5.Quest;

public abstract class Reptile {

    public abstract void dive() {}; // abstract methods do not have a body so compiler error occurs here and code does not compile
    public final void layEggs() { System.out.println("Reptile laying eggs");}

    public static void main(String[] args) {
        Reptile reptile = new Reptile1();
        reptile.layEggs();
        reptile.dive();
    }
}
