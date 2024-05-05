package Chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quest {
    public static void main(String[] args) {
        // int numFish = 4;
        // String fishType = "tuna";
        // String anotherFish = numFish + 1; // cannot onvert int to string so code does not compile here
        // System.out.println(anotherFish + " " + fishType);
        // System.out.println(numFish + " " + 1);

        // String s = "Hello";
        // String t = new String(s);
        // if ("Hello".equals(s)) System.out.println("one"); // ouputs one
        // if (t == s) System.out.println("two"); // does not print two
        // if (t.equals(s)) System.out.println("three"); // ouputs three
        // if ("Hello" == s) System.out.println("four"); // string literal same as s so it goes string pool and all are refrenced by s so thesmae and outputs four
        // if ("Hello" == t) System.out.println("five"); // does not print five one a string literal in pool and the other as an object

        // StringBuilder sb = new StringBuilder();
        // sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        // System.out.println(sb); // output abbaccca

        // String s1 = "java";
        // StringBuilder s2 = new StringBuilder("java");
        // if (s1 == s2) // comparing two seperate types so code won't compile
        // System.out.print("1");
        // if (s1.equals(s2))
        // System.out.print("2");

        // String letters = "abcdef";
        // System.out.println(letters.length()); // output 6
        // System.out.println(letters.charAt(3)); // output d
        // System.out.println(letters.charAt(6)); // exception thrown. no index 6

        // String numbers = "012345678";
        // System.out.println(numbers.substring(1, 3)); // 12
        // System.out.println(numbers.substring(7, 7)); // blankline
        // System.out.println(numbers.substring(7)); // 78
        
        // String s = "purr";
        // s.toUpperCase();
        // s.trim();
        // s.substring(1, 3);
        // s += " two"; // only part which takes effect on s, REM s is immutable
        // System.out.println(s.length()); // outputs 8
        // System.out.println(s); // ouputs purr two

        // String a = "";
        // a += 2; // a = a+2 = 2
        // a += 'c'; // a = a+'c' = 2+c = 2c
        // a += false; // a = a+false = 2c+fasle = 2cfalse
        // if ( a == "2cfalse") 
        //   System.out.println("==");
        // if ( a.equals("2cfalse")) 
        //   System.out.println("equals"); // ouputs equals

        // int total = 0;
        // StringBuilder letters = new StringBuilder("abcdefg");
        // total += letters.substring(1, 2).length();
        // total += letters.substring(6, 6).length();
        // total += letters.substring(6, 5).length(); // exception thrown here
        // System.out.println(total);

        // StringBuilder numbers = new StringBuilder("0123456789");
        // numbers.delete(2, 8);
        // numbers.append("-").insert(2, "+");
        // System.out.println(numbers); // output 01+89-

        // StringBuilder b = "rumble"; // you must instanciate StringBuilder ie create new object so code will not compile
        // b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        // System.out.println(b);

        // StringBuilder puzzle = new StringBuilder("Java");
        // // puzzle.reverse(); outputs avaJ
        // //puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1) outputs avaJ
        // System.out.println(puzzle);

        // int[][] scores = new int[5][]; // legal
        // Object[][][] cubbies = new Object[3][0][5]; // legal
        // String beans[] = new beans[6]; // not legal no type beans
        // String beans1[] = new String[]; // not legal, must give size
        // String beans2[] = new String[6]; // legal, must give size
        // java.util.Date[] dates[] = new java.util.Date[2][]; // legal
        // int[][] types = new int[]; // ilegal, has to be 2D on RHS also
        // int[][] types1 = new int[7][]; // legal , now 2D and ateast first size known
        // int[][] types4 = new int[][3]; // ilegaal, first dimension must be known 
        // int[][] java = new int[][]; // ilegal no dimension or size given for first array dimension


        // //arrays do not have the size method, capacity method and length method
        // //length is used but not as a method
        // String num[] = new String[2];
        // // int cap = num.capacity();
        // // int cap1 = num.length();
        // // int cap2 = num.size(); // does not compile
        // // char[]c = new char[2];
        // // int cap4 = c.size(); // does not compile
        // // int cap5 = c.capacity();
        // // int cap6 = c.length();
        // int number = num.length; // only corrects answer
        // System.out.println(number);

        // ArrayList l = new ArrayList();
        // int length = l.capacity;
        // int length1 = l.capacity();
        // int length2 = l.length;
        // int length3 = l.length();
        // int length4 = l.size;
        // int length5 = l.size(); //only correct one to get the number of elements in an array list
        // l.remove(0);
        // System.out.println(l.remove(0)); //this does not run successfully but compiles

        // List<String> list = new ArrayList<String>();
        // list.add("one");
        // list.add("two");
        // list.add(7); // compilation error here our Array list if of String and not int
        // for(String s : list) System.out.print(s);
 }
}
