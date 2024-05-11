package Chap5;

public class Elephant extends Mamal{
    /*
     * normally since it has constructor, java will use a default no-args constructor
     * But now, in inserting the no-args constructor, it cannot find in the parent class a constructor 
     * with no arguments. By default, it inserts the no-args constructor with a call the parent constructor 
     * with no arguments. But since it cannot find a constructor with no arguments in the parent class it fails.
     * 
     */

     /*
      * this is what the compiler  wanted to do
        public Elephant() {
        super(); // it cannot find a constructor with no arguments in the Mamal class so it fails
        }
        the solution is to explicitly define a constuctor in this class calling a valid parent class constructor
      */
    //   public Elephant(int age) {
    //     /*
    //      * this doesn't compile too because java compiler tries to insert the constructor of the
    //      * parent class  with no argumemts "super()" at the first line  and cannot find. 
    //      */
    //   }

    //the solution is to explicitly define a constuctor in this class calling a valid parent class constructor
    //but given we had a constructor in the parent class which had no argument or no constructorat all our code will work

    public Elephant() {
        super(10); // calling a valid constructor in the parent class and now this is the default constructor of the of the elephant class
    }
    /*
     * Subclasses may define no-argument constructors
     * even if their parent classes do not, provided the constructor of the child maps to a parent
     * constructor via an explicit call of the super() command.
     */

     
}
