package Chap5.Quest.polymorphicparams;

public class SnakeHandler {
    private Snake snake;
    public void setSnake(Snake snake) {
         this.snake = snake; 
    }
    public static void main(String[] args) {
        new SnakeHandler().setSnake(new Snake()); // compiles bcuz it's object of same class
        new SnakeHandler().setSnake(new Cobra()); // compiles because cobra is subclass of Snake
        /*
         * passing null as an argument to a method that expects an object of a specific type 
         * is allowed. When you pass null as an argument, you are essentially 
         * providing no object reference, indicating the absence of an object.
         * and having a instance varibale with a null value is allowed
         */
        new SnakeHandler().setSnake(null);
    }
    /*
     * the others cannot work beacsue they have an unrelateed type with the Snake class
     */
}
