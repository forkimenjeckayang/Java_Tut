package Chap6.usingatrystatement;

public class ExceptionInException {
    public static void main(String[] args) {
        ExceptionInException exception = new ExceptionInException();
        System.out.println(exception.exceptions());
    }
    public String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
            result += "before  ";
            v.length();
            result += "after";

            } catch (NullPointerException e) {
                result += "catch  ";
                throw new RuntimeException();
            } finally {
                result += "finally  ";
                throw new Exception();
            }
        } catch (Exception e) {
        result += "done";
        }
        return result;
      }
}
/*
 * The correct answer is before catch finally done. Everything is normal up until line
9, when "before" is added. Line 10 throws a NullPointerException. Line 37 is skipped
as Java goes straight to the catch block. Line 13 does catch the exception, and "catch" is
added on line 39. Then line 15 throws a RuntimeException. The finally block runs after
the catch regardless of whether an exception is thrown; it adds "finally" to result. At this
point, we have completed the inner try statement that ran on lines 8-19. The outer catch
block then sees an exception was thrown by the finally block and catches it on line 10; 
it adds "done" to result.
 */