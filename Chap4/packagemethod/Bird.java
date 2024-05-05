package Chap4.packagemethod;

public class Bird {
    //protected accesible  to package members and subclasses
    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }
}
