package Chap5.Inheritance;

public class ConstructorParentClassCall {
    private int age;
    private String name;
    public ConstructorParentClassCall(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public ConstructorParentClassCall(int age) {
        super(); // constructor from java.lang.Object since all callses extend from it by default
        this.age = age;
        this.name = null;
    }
}
