package Chap5.Inheritance;

public class Fish {

    protected int size;
    private int age;

    public Fish(int age) {
        //there is super(); by default
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
