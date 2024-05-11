package Chap5;

public class OverrideSuoercClass2 extends OverrideSuoercClass {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }
    /*
     * A recursive function is one that calls itself as part of execution, and it is common 
     * in programming. A recursive function must have a termination condition. In this example, 
     * there is no terminaion condition; therefore, 
     * the application will attempt to call itself infinitely and produce a stack overflow error at runtime.
     */
    public double getAverageWeight1() {
        //without the super keyworf, the method calls itself from within the class 
        return getAverageWeight1()+20; // INFINITE LOOP
    }

    public  void cal(){
        System.out.println(super.getAverageWeight()); // calls method in super class
        System.out.println(this.getAverageWeight()); // calls method from current class OverrideSuoercClass2
    }
    public static void main(String[] args) {
        OverrideSuoercClass2 o = new OverrideSuoercClass2();
        o.cal(); // output 50.0 \n 70.0
        // System.out.println(super.getAverageWeight()); //NOTE: cannot use this and super in static context
        // System.out.println(this.getAverageWeight());
    }
}
