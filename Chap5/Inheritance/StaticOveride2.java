package Chap5.Inheritance;

public class StaticOveride2 extends StaticOveride {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
        public static void main(String[] args) {
            StaticOveride2.eat();
    }
    /*
     * a method in parent class containig the static key word beign defined in the subclass
     * without the keyword will not work since we are trying to overide a method which should be hidden instead
     */

    // public void sneeze() { // DOES NOT COMPILE because we are trying to overdie a method that can be hidden
    //     System.out.println("Panda bear sneezes quietly");
    // }

    // public static void hibernate() { 
    //     // DOES NOT COMPILE , you should instead overide this method since in the parent class it is non static meaning it should be overwritten by instead
    //     System.out.println("Panda bear is going to sleep");
    // }

    public static boolean isBiped() {
        return true; // hiding static method defined in parent class
    }

    // public final boolean hasFeathers() { // DOES NOT COMPILE cannot overdie method from parent class
    //     return false;
    // }


}
