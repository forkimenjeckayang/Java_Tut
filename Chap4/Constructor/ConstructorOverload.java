package Chap4.Constructor;

public class ConstructorOverload {
    private String color;
    private int weight;

    public ConstructorOverload(int weight) { // first constructor

        this(weight, "white");  //calling the second constructor immediate before declaring the body of the first constructor ie must be the first statement in the constructor
        this.weight = weight;
        color = "brown"; // color set the second constructor is reset to brown by the first constructor
        // this(weight, "white"); // does not compile here because it was not the first statement in the constructor
    }
    public ConstructorOverload(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
    
    public static void main(String[] args) {
        ConstructorOverload c1 = new ConstructorOverload(5);
        System.out.println(c1.color+" "+c1.weight);
    }
}
