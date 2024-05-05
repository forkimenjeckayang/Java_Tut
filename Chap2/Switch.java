package Tut;

public class Switch {
    public static void main(String[] args)
    {
        int dayOfWeek = 5;

        switch (dayOfWeek) {
        
        //we see that the switch input variable is of type int , so case statements should be int.
        case 0:
          System.out.println("Sunday");
          break;

        //case S: won't work because the case statement is not an interger
        case 1:
          System.out.println("Monday");
          break;
        // with or without default the code will still run
        default:
           System.out.println("Weekday");
           break;
        case 6:
           System.out.println("Saturday");
           break;
        }

        final char a = 'A', d = 'D';
        char grade = 'B';
        switch(grade) {
          //using a variable as a case statement it must be final and should be of same type as switch parameter
          case a:
        
          case 'B': System.out.print("great");
         
          case 'C': System.out.print("good"); break;
         
          case d:
          case 'F': System.out.print("not good");
           }
    }
}
