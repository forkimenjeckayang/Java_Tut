package Chap5.abstarctclasses;

public abstract class AbstractClassDemo {
    protected String Name;

    public abstract String setName(String Name);

    public void getName() {
        System.out.println(this.Name);
    }
}
