package Chap4.packagemethod;

public class MotherDuck {
    //using deafult access modifier so classes in same package can use
    String noise = "quack";
    void quack() {
        System.out.println(noise);
    }
    private void makeNoise() {
        quack();
    }
}
