package Chap5.interfacess;

public interface RedefineDefaultInterfaceMethods {
    
    public default int getNumberOfFins() {
        return 4;
    }
    public default double getLongestFinLength() {
        return 20.0;
    }
    public default boolean doFinsHaveScales() {
        return true;
    }
    
}
