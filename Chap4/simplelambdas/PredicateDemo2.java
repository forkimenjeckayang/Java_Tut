package Chap4.simplelambdas;

import java.util.function.Predicate;

public class PredicateDemo2  {
    public static void main(String[] args) {
        // another way to implement it by directly instanciating the interface and creating the implememtation of the method
        Predicate<Integer> demo = new Predicate<Integer>(){
            @Override
            public boolean test(Integer t) {
                if (t % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        System.out.println(demo.test(10));
    } 

}
