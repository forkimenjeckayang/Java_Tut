package Chap5.Quest;

public class Arthropod1 extends Arthropod {
    public void printName(int input) { System.out.print("Spider"); }
    public static void main(String[] args) {
        Arthropod1 a = new Arthropod1();
        a.printName(4);
        a.printName(9.0);
    }
}
