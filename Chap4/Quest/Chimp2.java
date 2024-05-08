package Chap4.Quest;

// knowlege on normal imports whic import just classes into other classes
import Chap4.Quest.rope.*;
//knowlege on static import which imports staic members of a class
import static Chap4.Quest.rope.Rope.*;

public class Chimp2 {
    public static void main(String[] args) {
        Rope rp = new Rope();
        play();
        Rope rope2 = null; // means no object cretaed yet or no refence its like saying Rope rope2: as an instance varibale
        rope2.play();
    }
}
