package Chap5.Inheritance;

public class Lion extends Animal {
    public static void main(String[] args) {
        /*
         * the Lion object is actually “bigger” than the Animal object in the sense that it includes
         * all the properties of the Animal object (although not all of those properties may be directly
         * accessible) along with its own set of Lion attributes.
         */
        Lion animal = new Lion();
        animal.roar();
    }
    private void roar() {
        System.out.println("The "+getAge()+" year old lion says: Roar!");
        //System.out.println("The "+age+" year old lion says: Roar!"); // age is private in animal class so does not compile. Age is available but cannot be directly referenced by subclass or instance object
        }
    
}

//  private class  Goat {
// // you can only have one pulic cass in a java file 
//  }