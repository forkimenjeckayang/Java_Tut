package Chap2;

public class ControlFlow {
    public static void main(String[] args) {
        int hourOfTheDay = 21;
        //if-then statement handles boolean expressions
        // the result within if() will be a boolean value "true" or "false"
        if(hourOfTheDay < 20) {
            System.out.println("You are out of time");
            ++hourOfTheDay;
        }
        /*
         *  if(hourOfTheDay < 20)
                System.out.println("You are out of time");
                ++hourOfTheDay;

            without {}, the code of if statement will still work, just do the right indentation
            but here it only does the print if the condition is met , regardless it will always increment but if we do not want that, we use {}
            so wiyhout {}, it executes only the first line following the if statement
         */

        
        System.out.println(hourOfTheDay);
}
}
