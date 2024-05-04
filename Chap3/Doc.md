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
-