package Tut;

public class While {
    int roomInBelly = 5;
    public static void main(String[] args) {
        While s = new While();
        s.eatCheese(10);
        /*
         * the problem with this is that the loop  will never end
           x will always the two and y will keep increasing making it an unending loop (infinite loop)
            int x = 2;
            int y = 5;
            while(x < 10) // will always evaluate to true
            y++;
         */

        int x = 0;
        do {
          x++;
        }while(false);
        System.out.println(x);
    }

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
        bitesOfCheese--;
        roomInBelly--;
        }
    System.out.println(bitesOfCheese+" pieces of cheese left");
    }
}
