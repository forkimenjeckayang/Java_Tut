package Chap4.Quest;

public class BirdSeed {
    private int numberBags;
    boolean call;
    public BirdSeed() {
        this(2); // this sets numberBags to 2 now
       new BirdSeed(2); // works but does not set numberBags to 2
       //only way is to call the other constructor with "this" immediately at the first line of the constructor
    call = false;
    
    }
    public BirdSeed(int numberBags) {
        this.numberBags = numberBags;
    }
    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberBags);
    }
}
