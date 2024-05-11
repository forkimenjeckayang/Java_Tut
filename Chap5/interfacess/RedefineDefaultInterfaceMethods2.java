package Chap5.interfacess;

public interface RedefineDefaultInterfaceMethods2 extends RedefineDefaultInterfaceMethods  {

    //overwridden this method in the interface RedefineDefaultInterfaceMethods
    public default int getNumberOfFins() {
        return 8;
    }

    //converted the implemented default interface method to an abstarct method an implementing class will implement
    public double getLongestFinLength();
 
    // this is now seen as an asbtract method and it does not need to have a body. Can have a body oly if it is default method
    // public  boolean doFinsHaveScales() { // DOES NOT COMPILE t
    //     return false;
    // }

    

}
