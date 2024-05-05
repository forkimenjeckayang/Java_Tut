package Chap4.packagemethod;

public class GoodDuckling {
    public static void main(String[] args) {

        GoodDuckling goodDuckling = new GoodDuckling();
        goodDuckling.makeNoise();
    }
    public void makeNoise() {

        MotherDuck duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise); //default modifier enables it to be seen by this class since they are in thesame packages
        //duck.makeNoise(); // private access so itt cannot work here
    }
}
