package Tut;

public class Switch {
    public static void main(String[] args)
    {
        int dayOfWeek = 5;

        switch (dayOfWeek) {

        case 0:
          System.out.println("Sunday");
          break;
        case 1:
          System.out.println("Monday");
          break;
        // default:
        //    System.out.println("Weekday");
        //    break;
        case 6:
           System.out.println("Saturday");
           break;
        } 
    }
}
