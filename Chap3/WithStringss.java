package Chap3;

public class WithStringss {
    public static void main(String[] args) {
        String lastName = "Akwichek";

        /*
         * lastName.replace('A', 'a');
         * System.out.println(lastName);
         * u see that printinmg out lastname will still be Akwichek becasue remember, strings are immutable
         * i am trying to change lastName too something else and it won't work 
         * we can only change and create a new string out of that change
         */
        String newName  = lastName.replace("k", "K");
        System.out.println(newName);

        String newName2  = lastName.replace("A", "a");
        System.out.println(newName2); // now w have a changed string 

        String firstNmae = "\t  a b c \n";
        System.out.println(firstNmae); // outputs abc with alot of spaces 
        firstNmae.trim(); // this removbes all whitw spaces 
        System.out.println(firstNmae.trim()); // you can tell the difference

        
        /*
         * method chaining, we first trim tol remove whitev spaces
         * then we chnage to lowercase and finally we replace n with m in string and store in new string
         * variable called result. if we didnt store in a new string then replace method wwould not have taken effects
         */
        String result = "Animal    ".trim().toLowerCase().replace("n","m");
        System.out.println(result);
    }
}
