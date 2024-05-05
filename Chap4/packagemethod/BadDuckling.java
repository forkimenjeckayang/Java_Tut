package Chap4.packagemethod;

public class BadDuckling {
    public void makeNoise() {

        FatherDuck duck = new FatherDuck();
        //duck.quack(); // DOES NOT COMPILE because we are trying to access a private method in another class
        //System.out.println(duck.noise); // DOES NOT COMPILE because we are trying to access a private variable in another class

        
    }
}
