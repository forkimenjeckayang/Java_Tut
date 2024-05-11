package Chap5.Inheritance;

public class InherrittingVariables2 extends InherrittingVariables{
    //hidding variables tailLength
    protected int tailLength = 8;
    public void getMouseDetails() {
        System.out.println("[tail="+this.tailLength +",parentTail="+super.tailLength+"]");
    }
    
    public static void main(String[] args) {
        InherrittingVariables2 mouse = new InherrittingVariables2();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}
