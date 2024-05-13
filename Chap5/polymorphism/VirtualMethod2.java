package Chap5.polymorphism;

import Chap4.packagemethod.Bird;

public class VirtualMethod2  extends VirtualMethod1 {
    public String getName() {
        return "Peacock";
    }
    public static void main(String[] args) {
        VirtualMethod1 vm1 = new VirtualMethod2();
        /*
         * the call to this method creates another call the getName() method in the parent class
         * but it instead calls the overwridden method in the subclass. THis is because the method is virtual
         * ie it's non-static, non-final and non-private
         */
        vm1.displayInformation();
    }
    
}
