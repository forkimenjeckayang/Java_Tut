package Chap5.abstarctclasses;

public abstract class WithAbstract {
    
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    //abstract method for which no implementation is provided
    public abstract String getName();
}
