package Chap4.packagemethodb;
import  Chap4.packagemethod.MotherDuck;

public class BadCygnet {
    public void makeNoise() {

        MotherDuck duck = new MotherDuck();
        //duck.quack(); // DOES NOT COMPILE because MotherDuck is default access which limits it to only classes in it's package
        //System.out.println(duck.noise); // DOES NOT COMPILE same thing here
    }
    
}
