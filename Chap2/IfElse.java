package Chap2;

public class IfElse {
    public static void main(String[] args) {
        int hourOfTheDay = 13;

        if(hourOfTheDay < 12) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }
        //similaryly i can execute without the {} an dit will work executing the first line after if statement and then next line after else statement
        /*
           if(hourOfTheDay < 12) 
               System.out.println("Good Morning");
             else 
               System.out.println("Good Afternoon");
        */

        /*
         *  int x = 1;
            if(x) {
                the code does not compile as we said earlier, if takes in boolean expression
                x is not a boolen value or returns a boolean value so code DOES NOT COMPILE
            }
         */

        // use of tenary operator , we can use if and else statements to do this too but with the tenary operator it's small and easy to use
        int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y); // will still work  int x = y > 5 ? 2 * y : 3 * y
        //int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE because horse is string and cannot be stored in int


        
        System.out.println((y > 5) ? (21) : ("Zebra")); // for readability add () around expressions
        System.out.println(x);
        System.out.println((y > 5) ? 21 : "Zebra"); // this compiles bcuz sout can convert both outputs to string be printing

    }
}
