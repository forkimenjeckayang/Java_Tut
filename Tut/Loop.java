package Tut;

public class Loop {
    public static void main(String[] args) {
        for(int i=0; i<10 ; ) {
            /*
             * we get an infinite loop becasue when x starts at 0, it was noramlly to be incremented
             * but the increment is discarded because of post teh post increment
             * we keep on looping around 0 beacuse we have o first store it at i and the increment
             * which was supposed to be stored discarded
             */
            i = i++;
            System.out.println("Hello World");
        }
     }
    }