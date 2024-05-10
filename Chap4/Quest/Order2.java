package Chap4.Quest;

public class Order2 {

    String value = "t";

    { value += "a"; }

    { value += "c"; }

    public Order2() {
        value += "b";
    }
    public Order2(String s) {
        value += s;
    }
    public static void main(String[] args) {
        Order2 order = new Order2("f"); // output : tacf 
        order = new Order2(); // output : tacb, since it is a reference still of first object f is replaced with b
        System.out.println(order.value); // output : tacb
    } 
}

