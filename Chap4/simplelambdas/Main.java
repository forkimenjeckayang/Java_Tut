package Chap4.simplelambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // CheckIfHopper hoop = new CheckIfHopper();
        List<Animal> animals = new ArrayList<Animal>(); // array list to hold animal objects
        animals.add(new Animal("fish", false, true)); // adding firt animal object
        animals.add(new Animal("bird", true, false)); // adding second animal object
        animals.add(new Animal("turtle", false, true)); // adding third animal object

        //calling the checkAnimals method
        // checkAnimals(animals, hoop); // this will work
        // checkAnimals(animals, new CheckIfHopper());  // or this
        checkAnimals(animals, hoop -> hoop.canHop()); // with lambdas
        checkAnimals(animals, hoop -> hoop.canSwim()); // with lambdas
    }

    //method that takes in a list of animal objects and checker of type Checktrait
    public static void checkAnimals(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals){
            if (checker.test(animal)) 
                System.out.println(animal.toString() + " can hop");
             else 
                System.out.println(animal.toString() + " cannot hop");
            
        }
    }
}
