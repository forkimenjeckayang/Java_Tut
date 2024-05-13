package Chap5.Quest;

public abstract class Bird {
    /*
     * this will be called though , it is overridden but since it is not vitual (it's private) and the call is made from the
     * bird class it will call this method within this class.
     */
    private void fly() { System.out.println("Bird is flying"); } 
    public static void main(String[] args) {
        Bird bird = new Bird1();
        bird.fly(); // output Bird is flying
    }
}
