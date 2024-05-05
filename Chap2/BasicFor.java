package Chap2;

public class BasicFor {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //the code wbelow is an infinite loop
        for( ; ; ) {
            System.out.println("Hello World");
        }
    // code below does not compile because f is used in the scope and valid only within the loop and not outof the loop
        // int f = 0;
        // long y = 0;
        // for( y = 10, f = 5; f < 5 && y < 10; f++, y++) {
        // System.out.print(y + " ");
        // }
        // System.out.print(f);

        // does not compile too because int and long are of different types
        // for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) {
        //     System.out.print(x + " ");
        // }
    }
}
