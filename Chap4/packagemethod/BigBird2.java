package Chap4.packagemethod;

//extends the bird class in same package so acceses the elements or protected fields
public class BigBird2 extends Bird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.floatInWater(); // works because Big Bird is in same package as Bird
        System.out.println(bird.text);
    }
}
