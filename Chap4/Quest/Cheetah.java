package Chap4.Quest;

public class Cheetah {
    int numSpots;
    public Cheetah(int numSpots) {
    //   numSpots = numSpots;
        // numSpots = this.numSpots;
        this.numSpots = numSpots; // works
        // numSpots = super.numSpots; not compiled
    }
    public static void main(String[] args) {
        System.out.println(new Cheetah(50).numSpots);
    }
    
}
