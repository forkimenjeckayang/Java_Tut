package Chap4.packagemethod;

public class FatherDuck {

    private String noise = "quack";
    private void quack() {
        System.out.println(noise);
    }
    private void makeNoise() {
        quack(); // private access is ok 
   }
}
