package Chap6.usingatrystatement;

public class TryCatchFinally {
    public static void main(String[] args) {
        String y = ""; // initializes y to nothing(empty string)
        try {
            y += "t"; // value of y becomes "t"
        } catch (Exception e) { // no exception thrown so it skips this block
            y += "c";
        } finally {
            y += "f"; // value of y becomes "tf" here
        }

        y += "a"; //  value of y becomes "tfa" heres
        System.out.println(y); // output is tfa
    }
}
