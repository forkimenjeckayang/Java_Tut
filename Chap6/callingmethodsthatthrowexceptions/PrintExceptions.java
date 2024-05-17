package Chap6.callingmethodsthatthrowexceptions;

public class PrintExceptions {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e); // let java print it out
            System.out.println(e.getMessage()); // print just the message
            e.printStackTrace(); // print where the stack trace comes from
        }
    }
    private static void hop() {
        throw new RuntimeException("cannot hop");
   }
   /*
    * code outputs
    java.lang.RuntimeException: cannot hop
    at Chap6.callingmethodsthatthrowexceptions.PrintExceptions.hop(PrintExceptions.java:14)
    at Chap6.callingmethodsthatthrowexceptions.PrintExceptions.main(PrintExceptions.java:6)
    */
}
