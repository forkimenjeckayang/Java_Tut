package Chap5.interfacess;

public class Bear implements Herbivore,Omnivore {
    /*
     * both interfaces have the method eatPlants() , which won't cause conflicts 
     * once there is an implementation of the method eatPlants(), it works for either of the classes
     * that have thesame method
     * creating a class that implements one of the two methods automatically 
     * implements the second method. In this manner, the interface methods are considered duplicates
     * since they have the same signature.
     */
    public void eatMeat() {
        System.out.println("Eating meat");
    }
    public void eatPlants() {
        System.out.println("Eating plants");
    }
    
}
