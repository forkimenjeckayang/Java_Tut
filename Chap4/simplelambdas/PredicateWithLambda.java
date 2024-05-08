package Chap4.simplelambdas;

import java.util.function.Predicate;

public class PredicateWithLambda {
    public static void main(String[] args) {
        
        Predicate<Integer> demo = t -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(demo.test(10));
    } 
}
