package Chap5;

public class Animal {
    private int age; // not accessible from subclass or any other place
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
