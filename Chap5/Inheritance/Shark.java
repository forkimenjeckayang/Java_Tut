package Chap5.Inheritance;

public class Shark extends Fish {

    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }
    public void displaySharkDetails() {
        /*
         * To reference a member in a parent class, you can just call it directly
         * you can use the keyword this to access a member of the class.
         */
        System.out.print("Shark with age: "+getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");

        /*
         *  you may also use "this" to access members of the parent class that 
         * are accessible from the child class, since a child class inherits all of its parent members.
         */
        System.out.print("Shark with age: "+this.getAge());
        System.out.print(" and "+this.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");

        /*
         * alternatively 
         * you can explicitly reference a member of the parent class by using the super key-word
         */
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");

        /*
         * the below does not compile because numberOfFins is in the child class not the parent class
         * we user "super" to access members of the parent class and only "this" may be used for members
         * defined in the current class.
         */
        //System.out.print(" with "+super.numberOfFins+" fins"); // DOES NOT CIOMPILE


    }
}
