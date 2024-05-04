package Chap3;

public class WithStringBuilder {
    public static void main(String[] args) {
        // the loop prints out from a-z
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
          alpha += current;
        System.out.println(alpha);

        // does thesame as the code above 
        StringBuilder alpha1 = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alpha1.append(current);
        System.out.println(alpha);

        // with strings we modified and returned a new String but with StringBuilder we modify and return a return a reference of itself
        StringBuilder sb = new StringBuilder("start"); // here sb  is start
        sb.append("+middle"); // here sb is start+middle
        StringBuilder same = sb.append("+end"); //here same is start+middle+end
        System.out.println(same);

        /*
         * Having only one string builder object a becasue new StringBuilder was called only once
         * so any other variable still created will be referenced to a still.
         */
        StringBuilder a = new StringBuilder("abc"); 
        StringBuilder b = a.append("de"); // a becomes abcde and then assigned to b which still references a
        b = b.append("f").append("g"); // b becomes abcdefg same as a since b still references a
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //some string builder methods
        StringBuilder food = new StringBuilder("Vegetables");
        food.charAt(3); // output e
        food.length(); // output 10
        food.substring(food.indexOf("t"), food.indexOf("s")); // output table
        System.out.println(food.charAt(3)+" " +food.length()+ " "+food.substring(food.indexOf("t"), food.indexOf("s")));

        StringBuilder sb2 = new StringBuilder().append(1).append('c'); // here sb2 is 1c 
        sb2.append("-").append(true); // it beccomes 1c-true here
        System.out.println(sb2);

        System.out.println("size before : " + sb2.length());
        sb2.insert(2,"-"); // insert - at index 2 of sb which is 1c-true. id doesn't replace but insert hence increasing length
        System.out.println("size after : " + sb2.length());
        System.out.println(sb2); // before trhe deletion below

        sb2.delete(2, 4); // delete from index 2 to 4(but index four not included)
        System.out.println(sb2);
        sb2.deleteCharAt(1); // delete character at index 1 so ouputs 1true
        System.out.println(sb2);

        sb2.reverse(); // reverses the string
        System.out.println(sb2);

        sb2.toString();// converts String to String
        System.out.println(sb2);

        //equality
        StringBuilder one1 = new StringBuilder(); // new object of value null
        StringBuilder two2 = new StringBuilder(); // new object of value null
            // not a new object it is refrence to object one1 and holds same value as one1 in memory
            //so three3 and one1 have same memeroy location
        StringBuilder three3 = one1.append("a");
        System.out.println(one1 == two2); // false different memeory locations
        System.out.println(one1 == three3); // true same memory location

        /*
         * remember that Strings are immutable and literals are pooled
         * The JVM created only one literal in memory. x and y both point to the same location in memory; therefore, the statement outputs true
         */
        String xi = "Hello World";
        String yi = "Hello World";
        System.out.println(xi == yi); // never use == to compare string objects though not bad but not adviceable use the equals method
        xi.equals(yi); // the method checks values inside the string rather than the string itself while == compares memeory locations
        System.out.println(xi.equals(yi));
        


    }
}
