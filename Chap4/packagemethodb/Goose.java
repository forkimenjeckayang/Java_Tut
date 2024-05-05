package Chap4.packagemethodb;

import Chap4.packagemethod.Bird;

public class Goose extends Bird {
    public static void main(String[] args) {

        //using advantage of inheritance here
        //since Goose is a subclass of Bird it also has same methods and fields as Bird
        //so we can use the methods and fields of Bird in Goose by instanciating goose itself
        Goose goose = new Goose();
        goose.floatInWater();
        System.out.println(goose.text);

        /*
         * using an instance of Bird here won't let you access the protected fields of Bird since
         * it is in a differnet package
         */
        Bird bird = new Bird();
        //bird.floatInWater(); // DOES NOT COMPILE though it inherits it is not from same package as Bird

    }
}
