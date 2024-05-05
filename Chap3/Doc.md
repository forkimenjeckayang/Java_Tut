## Strings
-A sting is simply a sequence of characters and in java you must put thrm within "" for java to know it is a sting ie String name = "Forkim Akwichek"
-It is a refrence type and we know reference types are created using the new keyword
-String is special and does not need to be instanciated with new before using it
-We combine two strings together using "+" known as concatenation
  eg. 1+2=3 but "1" + "2" gives 12 as a string
-If operands arfe numeric then it is addition and if either operand is a string then it is cocatenation
-The string pool contains literal values that appear in your program. For example,
“name” is a literal and therefore goes into the string pool. myObject.toString() is a string
but not a literal, so it does not go into the string pool. Strings not in the string pool are gar-
bage collected just like any other object.
-A string is a sequence of characters and Java counts from 0 when indexed
   ## String Methods
-The method length() returns the number of characters in the String.
-The method charAt() lets you query the string to find out what character is at a specific
index.
-Unlike charAt(), the indexOf() method doesn’t throw an exception if it can’t find a match. indexOf() returns –1 when no match is found.
-The method substring() returns parts of the string. The first parameter is the index to start with for the returned string.There is an optional second parameter, which is the end index you want
to stop at. Notice we said “stop at” rather than “include.”
-The trim() method removes whitespace from the beginning and end of a String.
-You can call multiple methods on thesame string called method chaining

## String Builder
-The string builder is a class which creates strings too and unlike the String class, it is not immutable meaning you can change a string when created with it.
-When we chained String method calls, the result was a new String with the answer. Chaining StringBuilder objects doesn’t work this way. Instead, the StringBuilder changes its own state and returns a reference to itself!
- ## StringBuilder sb1 = new StringBuilder();
  ## StringBuilder sb2 = new StringBuilder("animal");
  ## StringBuilder sb3 = new StringBuilder(10); // tells java create a string of lenght 10 ie will have index 0-9 implying string of 10 characters
 * The first says to create a StringBuilder containing an empty sequence of characters and assign sb1 to point to it.
 * The second says to create a StringBuilder containing a specific value and assign sb2 to point to it. For the first two, it tells Java to manage the implementation details. 
 * The final example tells Java that we have some idea of how big the eventual value will be and would like the StringBuilder to reserve a certain number of slots for characters.
-Since the string builder object is immutable Java knows the size can increase with time. Meaning if we puit 10 at first, if we have to increase the lenght of the file then memory will be allocated for that
-The insert() method adds characters to the StringBuilder at the requested index and
returns a reference to the current StringBuilder.
-The delete() method is the opposite of the insert() method. It removes characters from the sequence and returns a reference to the current StringBuilder. The deleteCharAt() method is convenient when you want to delete only one character.
-StringBuffer does the same thing as StringBuilder but more slowly because it is thread safe

## Arrays
-An array is an area of memory on the heap with space for a designated number of elements. An array can be of any type in java
-An array is an ordered list, It can contain duplicates.
-int[] ids, types; // two varibales of type int[]
-int ids[], types; // we have just one varibale which is an integer array *ids*, the other *types* is just a regular integer
   ## For sorted Arrays
3: int[] numbers = {2,4,6,8};
4: System.out.println(Arrays.binarySearch(numbers, 2)); // 0
5: System.out.println(Arrays.binarySearch(numbers, 4)); // 1
6: System.out.println(Arrays.binarySearch(numbers, 1)); // -1
7: System.out.println(Arrays.binarySearch(numbers, 3)); // -2
8: System.out.println(Arrays.binarySearch(numbers, 9)); // -5

Take note of the fact that line 3 is a sorted array. If it weren’t, we couldn’t apply either
of the other rules. Line 4 searches for the index of 2. The answer is index 0. Line 5 searches
for the index of 4, which is 1.
Line 5 searches for the index of 1. Although 1 isn’t in the list, the search can determine
that it should be inserted at element 0 to preserve the sorted order. Since 0 already means
something for array indexes, Java needs to subtract 1 to give us the answer of –1. Line 7
is similar. Although 3 isn’t in the list, it would need to be inserted at element 1 to preserve
the sorted order. We negate and subtract 1 for consistency, getting –1 –1, also known as
–2. Finally, line 8 wants to tell us that 9 should be inserted at index 4. We again negate and
subtract 1, getting –4 –1, also known as –5.

## Varargs
When creating an array yourself, it looks like what we’ve seen thus far. When one is passed
to your method, there is another way it can look. Here are three examples with a main()
method:
public static void main(String[] args)
public static void main(String args[])
public static void main(String... args) // varargs

* Creating a Multidimensional Array
Multiple array separators are all it takes to declare arrays with multiple dimensions. You
can locate them with the type or variable name in the declaration, just as before:
int[][] vars1; // 2D array
int vars2 [][]; // 2D array
int[] vars3[]; // 2D array
int[] vars4 [], space [][]; // a 2D AND a 3D array

You can specify the size of your multidimensional array in the declaration if you like:

## Array List
* An array has one glaring shortcoming: you have to know how many elements will be in the
array when you create it and then you are stuck with that choice. Just like a StringBuilder,
ArrayList can change size at runtime as needed. Like an array, an ArrayList is an ordered
sequence that allows duplicates.
* As with StringBuilder, there are three ways to create an ArrayList:
ArrayList list1 = new ArrayList();
ArrayList list2 = new ArrayList(10);
ArrayList list3 = new ArrayList(list2);
* Java 5 introduced generics, which allow you to specify the type
of class that the ArrayList will contain.
ArrayList<String> list4 = new ArrayList<String>();
ArrayList<String> list5 = new ArrayList<>(); // the diamond operator *<>*
* ArrayList implements an interface called List. In other words, an ArrayList is a List. Know that you can store an ArrayList in a List reference variable but not vice versa. The reason is that List is an interface and interfaces can’t be instantiated.
List<String> list6 = new ArrayList<>();
ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE
* If you didn’t specify a type when creating the ArrayList, E means Object. Otherwise, it means the class you put between < and >.
-Each primitive has a wrapper class
boolean Boolean new Boolean(true)
byte Byten new Byte((byte) 1)
short Short new Short((short) 1)
int Integer new Integer(1)
long Long new Long(1)
float Float new Float(1.0)
double Doublenew Double(1.0)
char Characternew Character('c')
-So when we want to use an arraylist with a primitive, we use it's wrapper class to do so
-The wrapper classes also have a method that converts back to a primitive.
  The parse methods, such as parseInt(), return a primitive, and the valueOf() method returns a wrapper class.

## Autoboxing
Why won’t you need to be concerned with whether a primitive or wrapper class is returned,
you ask? Since Java 5, you can just type the primitive value and Java will convert it to the
relevant wrapper class for you. This is called autoboxing. Let’s look at an example:
 List<Double> weights = new ArrayList<>();
 weights.add(50.5); // [50.5]
 weights.add(new Double(60)); // [50.5, 60.0]
 weights.remove(50.5); // [60.0]
 double first = weights.get(0); // 60.0
*Line 5 autoboxes the double primitive into a Double object and adds that to the List. Line 6 shows that you can still write code the long way and pass in a wrapper object. Line 7 again autoboxes into the wrapper object and passes it to remove(). Line 8 retrieves the Double and unboxes it into a double primitive.*
-To sort an arraylist u use a helper class Collections with method sort

## Dates and Time
When working with dates and times, the first thing to do is decide how much information you need. 
* *LocalDate Contains* just a date—no time and no time zone. A good example of LocalDate is your birthday this year. It is your birthday for a full day regardless of what time it is
* *LocalTime Contains* just a time—no date and no time zone. A good example of LocalTime is midnight. It is midnight at the same time every day.
* *LocalDateTime Contains* both a date and time but no time zone.
-Remember *that the month comes before the date*. Also, Java tends to use a 24-hour clock even though the United States uses a 12-hour clock with a.m./p.m.
-For months in the new date and time methods, Java counts starting from 1 like we human beings do.
-The date and time classes have *private constructors* to force you to use the static methods. The exam creators may try to throw something like this at you:
*LocalDate d = new LocalDate(); // DOES NOT COMPILE*
-*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
 date.plusDays(10);
 System.out.println(date);* 
 It prints January 20, 2020. Adding 10 days was useless because we ignored the result.
 Whenever you see immutable types, pay attention to make sure the return value of a
 method call isn’t ignored.
-*LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
 date = date.plusMinutes(1); // DOES NOT COMPILE*
 LocalDate does not contain time. This means you cannot add minutes to it. This can be
 tricky in a chained sequence of additions/subtraction operations

-You cannot chain methods when creating a Period.
Period annually = Period.ofYears(1); // every 1 year
Period quarterly = Period.ofMonths(3); // every 3 months
Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
Period everyOtherDay = Period.ofDays(2); // every 2 days
Period everyYearAndAWeek = Period.of(1, 0, 7); // every 2 days

Period wrong = Period.ofYears(1).ofWeeks(1); // every week instead of every year and a week
This tricky code is really like writing the following:
Period wrong = Period.ofYears(1);
wrong = Period.ofWeeks(1);

-DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
-DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
