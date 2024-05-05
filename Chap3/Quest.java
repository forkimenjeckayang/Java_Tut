package Chap3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
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

        // ArrayList<Integer> values = new ArrayList<>();
        // values.add(4); // [4]
        // System.out.println(values);
        // values.add(5); // [4, 5]
        // System.out.println(values);
        // values.set(1, 6); // replace what is at index 1 and put 6 // [4, 6]
        // System.out.println(values);
        // values.remove(0); // [6]
        // System.out.println(values);
        // for (Integer v : values) 
        //   System.out.print(v); // ouputs [6]

        // List<Integer> list = Arrays.asList(10, 4, -1, 5);
        // Collections.sort(list);
        // System.out.println(list); // sorted list : [-1, 4, 5, 10]
        // Integer array[] = list.toArray(new Integer[4]);
        // System.out.println(array[0]); // -1

        // String [] names = {"Tom", "Dick", "Harry"};
        // List<String> list = names.asList(); // supposed to be Arrays.asList(names) so compillation error
        // list.set(0, "Sue");
        // System.out.println(names[0]);

        // List<String> hex = Arrays.asList("30", "8", "3A","FF");
        // Collections.sort(hex);
        // System.out.println(hex);
        // int x = Collections.binarySearch(hex, "8");
        // int y = Collections.binarySearch(hex, "3A");
        // int z = Collections.binarySearch(hex, "4F");
        // System.out.println(x + " " + y + " " + z); // 2 1 -3

        // List<Integer> ages = new ArrayList<>();
        // ages.add(Integer.parseInt("5"));
        // ages.add(Integer.valueOf("6"));
        // ages.add(7);
        // System.out.println(ages);
        // ages.add(null); // at run time this will throw a runtime exception NullPointerException
        // System.out.println(ages);
        // for (int age : ages) 
        //   System.out.print(age);

        // List<String> one = new ArrayList<String>();
        // one.add("abc");
        // List<String> two = new ArrayList<>();
        // two.add("abc");
        // if (one == two)
        // System.out.println("A");
        // else if (one.equals(two))
        // System.out.println("B"); //prints B becasue contents of one and two are thesame
        // else
        // System.out.println("C");

        // LocalDate date = LocalDate.of(2014, Calendar.JUNE, 21); // calender.june is May since it starts keeping count from 0 as January
        // LocalDate date2 = LocalDate.of(2014, Month.JUNE, 21); // month.june is June since it keep counts from 1 as January
        // System.out.println(date2);

        // LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        // date.plusDays(2); // won't take effect since it is not stored in a variable note datetime is immutable
        // date.plusHours(3); // won't compile since in LocalDate we do not have time

        // LocalDate date = LocalDate.of(2018, Month.APRIL, 40); // runtime error , invalid day of month
        // System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());

        // LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        // date.plusDays(2); // no effect taken on the days
        // date.plusYears(3); // no effect taken on the years
        // System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // outputs same result 2018 APRIL 2018

        // LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // Period p = Period.of(1, 2, 3); // 1 years 2 months 3 days
        // d = d.minus(p); // returns 2014, 3, 7, 11, 22, 33
        // DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        // System.out.println(d.format(f)); // returns  time since we formated only time so it retuns only the time 11:22 AM. and not the date

        // LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // Period p = Period.ofDays(1).ofYears(2); // results to period of 2 years only
        // d = d.minus(p); // retuns 2013, 5, 10, 11, 22, 33
        // DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        // // 5/10/13 11:22 AM
        // System.out.println(f.format(d)); // since we formated in date and time it will return date and time and month comes first
    }
}
