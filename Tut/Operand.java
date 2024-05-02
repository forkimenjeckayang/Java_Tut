package Tut;

import java.io.File;

public class Operand {
    public static void main(String[] args) {
        int y =4;
        double x1 = 3 + 2 * --y; //dercrments y before operation and goes from right to left
        
        double x2 = 3 + 2 * y--; //dercrments y but does not take effect yet until next time we are using y

        int x = 2 * 5 + 3 * 4 - 8; //computes in bodmas.

        int x11 = 1;
        long y11 = 33;
        Long  result = x11*y11; // since long y is larger than int x, x is promoted to long and x*y is calculated

        double x3 = 39.21;
        //float y3 = 2.1; // won't work, because all floats are assumed to be doubles unless prefixed with and For F
        float y3 = 2.1F; // will now work since double is larger than float , float is promoted to double and y3+x3 is computed

        double results = x3+y3;

        //smaller datypes such as short , byte and char are promoted to int first anytime they are used before computation 
        short x4 = 10;
        short y4 = 3;

        int sresult = x4 + y4; 

        short x5 = 14;
        float y5 = 13; // seen as int which can be converted to float since int is smaller than float
                      //float y5 = 13.0; // seen as a double which cannnot be converted to float directly so will fail unless prefix with f or F
                     //float y5 = 13.0f; // now will identify as a float
        double z5 = 30;
        /*
         * x is promoted to int since it is a short then to float so that it can be multiplied with y5
         * and then thier result is promotd to double so that it can be devided by z5
         */
        double result5 = (x5 * y5) / z5;

        boolean x6 = false;
        System.out.println(x6); // output false
        // using the logical complement operator "!" which does not work with numeric operations
        x6 = !x6;
        System.out.println(x6); //output true

        double x7 = 1.21;
        // neagting the value of x7 using the "-" operator which doesn't work with boolean operations
        x7 = -x7;

        //int x8 = 1.0; // converting from smaller type to larger type does not work directly like here double to integer

        //casting primitive types
        int z = (int)9l; // cannot convert from long to int directly so we type cast to int
        long t = 192301398193810323L; // removing L will identify as an integer and cannot convert int to long directly 
        int w = (int)1.0;
        short v = (short)1921222; // too ltrge to be stored as a short so we have aa numeric overflow and it is stored as 20678

        short p = 10; // promoted to int
        short p1 = 3; // promoted to int
        //short z1 = x * y; // having two integers will give an int result  and cannot be converted to short directly since int is geater than short
        short z1 = (short)(p * p1); // now converted yhe int to short so it could be stored

        //using equality operator to verify references of objects
        File f1 = new File("myFile.txt");
        File f2 = new File("myFile.txt");
        File f = f1;
        System.out.println(f1 == f2); // Outputs false
        System.out.println(f1 == f); // Outputs true



        System.out.println(z1);
        System.out.println(v);
        System.out.println(result5);
        System.out.println(sresult);
        System.out.println(result);
        System.out.println(results);
        System.out.println(x);
        System.out.println(x1 + " " + x2 + " " );
        // System.out.println(9 / 3); // Outputs 3
        // System.out.println(9 % 3); // Outputs 0
        
    }
}
