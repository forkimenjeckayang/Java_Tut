package Tut;

public class Iterate {
    public static void main(String[] args) {
        int m0 = 9, n1 = 1, x0 = 0;
        while(m0 > n1) {
            m0--;
            n1 = n1 + 2;
            x0 = x0 + m0 + n1;
        }
        System.out.println(x0);
    }
   
}
