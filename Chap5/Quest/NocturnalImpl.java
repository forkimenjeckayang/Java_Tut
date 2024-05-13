package Chap5.Quest;

public class NocturnalImpl implements Nocturnal {
    public boolean isBlind() { return false; }
    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal)new NocturnalImpl();
        System.out.println(nocturnal.isBlind());
        /*
         * ouputs false though implememnted in the interface, it has been overwritten in this class
         * and since it is a virtual method , the overwridden method will be called.
         */
    }
}
