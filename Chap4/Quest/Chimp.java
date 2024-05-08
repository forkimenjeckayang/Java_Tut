package Chap4.Quest;

// knowlege on normal imports whic import just classes into other classes
import Chap4.Quest.rope.*;
//knowlege on static import which imports staic members of a class
import static Chap4.Quest.rope.Rope.*;

public class Chimp {
    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
        System.out.println(LENGTH);} // output : swing swing 10
}

