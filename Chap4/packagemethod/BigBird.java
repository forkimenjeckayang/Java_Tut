package Chap4.packagemethod;

public class BigBird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.floatInWater(); // works because Big Bird is in same package as Bird
        System.out.println(bird.text);
    }
}
