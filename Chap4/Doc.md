## Method
-Method declaration : public final void nap(int minutes) throws InterruptedException {}
* public -The method can be called from any class.(anywhere)
* private -The method can only be called from within the same class.
* protected -The method can only be called from classes in the same package && subclasses.
* Default (*Package Private*) Access -The method can only be called from classes in the same package. 
This one is tricky because there is no keyword for default access. You simply omit the access modifier. When no access modifier is used then it is *default*
You can have zero or more specifiers in a method declaration.
 ## Specifiers
-static : class methods.
-abstract : Used when not providing a method body.
-final : Used when a method is not allowed to be overridden by a subclass.

public void walk1() {}
public final void walk2() {}
public static final void walk3() {}
public final static void walk4() {}
public modifier void walk5() {} // DOES NOT COMPILE
public void final walk6() {} // DOES NOT COMPILE
final public void walk7() {}

walk1() is a valid method declaration with no optional specifier. This is okay; it is optional, after all. walk2() is a valid method declaration, with final as the optional specifier. walk3() and walk4() are valid method declarations with both final and static as optional specifiers. The order of these two keywords doesn’t matter. walk5() doesn’t compile because modifi er is not a valid optional specifier. walk6() doesn’t compile because the optional specifier is after the return type.
walk7() does compile. *Java allows the optional specifiers to appear before the access modifier*. This is a weird case and not one you need to know for the exam. We are mentioning it so you don’t get confused when practicing.

# Return Type
The return type might be an
actual Java type such as String or int. If there is no return type, the void keyword is used.
This special return type comes from the English language: void means without contents. In
Java, we have no type there
* Methods with a return type other than void are required to have a return statement inside the
method body. This return statement must include the primitive or object to be returned.
* Methods that have a return type of void are permitted to have a return statement with no
value returned or omit the return statement entirely.

public void walk1() { }
public void walk2() { return; }
public String walk3() { return ""; }
public String walk4() { } // DOES NOT COMPILE
public walk5() { } // DOES NOT COMPILE
String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE

Since the return type of walk1() is void, the return statement is optional. walk2() shows
the optional return statement that correctly doesn’t return anything. walk3() is a valid
method with a String return type and a return statement that returns a String. walk4()
doesn’t compile because the return statement is missing. walk5() doesn’t compile because
the return type is missing. walk6() is a little tricky. There is a return statement, but it doesn’t always get run. If a is 6, the return statement doesn’t get executed. Since the String always needs to be returned, the compiler complains.

## Method Name
Method names follow the same rules as we practiced with variable names in Chapter 1, “Java Building Blocks.” To review, an identifier may only contain letters, numbers, $, or _. Also, the first character is not allowed to be a number, and reserved words are not allowed. By convention, methods begin with a lowercase letter but are not required to.

public void walk1() { }
public void 2walk() { } // DOES NOT COMPILE
public walk3 void() { } // DOES NOT COMPILE
public void Walk_$() { }
public void() { } // DOES NOT COMPILE

walk1() is a valid method declaration with a traditional name. 2walk() doesn't compile because identifiers are not allowed to begin with numbers. walk3() doesn't compile because the method name is before the return type. Walk_$() is a valid method declaration. While it certainly isn't good practice to start a method name with a capital letter and end with punctuation, it is legal. The final line of code doesn't compile because the method name is missing.

## Parameters of Methods
Although the parameter list is required, it doesn’t have to contain any parameters. This means you can just have an empty pair of parentheses after the method name, such as void nap(){}. If you do have multiple parameters, you separate them with a comma.For now, let’s practice looking at method signatures with “regular” parameters:

public void walk1() { }
public void walk2 { } // DOES NOT COMPILE
public void walk3(int a) { }
public void walk4(int a; int b) { } // DOES NOT COMPILE
public void walk5(int a, int b) { }

walk1() is a valid method declaration without any parameters. walk2() doesn't compile
because it is missing the parentheses around the parameter list. walk3() is a valid method
declaration with one parameter. walk4() doesn't compile because the parameters are sepa-
rated by a semicolon rather than a comma. Semicolons are for separating statements, not
parameter lists. walk5() is a valid method declaration with two parameters.

## Varargs in Methods
It is a little different than an array, though. A vararg parameter must be the last element in a method’s parameter list. This implies *you are only allowed to have one vararg parameter per method*.

public void walk1(int... nums) { }
public void walk2(int start, int... nums) { }
public void walk3(int... nums, int start) { } // DOES NOT COMPILE
public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

walk1() is a valid method declaration with one vararg parameter. walk2() is a valid method declaration with one int parameter and one vararg parameter. walk3() and walk4() do not compile because they have a vararg parameter in a position that is not the last one.

When calling a method with a vararg parameter, you have a choice. You can *pass in an array*, or you can *list the elements of the array and let Java create it for you*. You can even *omit the vararg values in the method call and Java will create an array of length zero for you*.

## Access Modifiers
Static methods don’t require an instance of the class. They are shared among all users of the class
You can use the Class name directly to access static members of the class without an instance
Static methods require static variables

- ## *Non static method can call a static method*
- ## *Static method cannot call a non static method*
- ## *A static variable cannot access an instance varibale* 
-Other static variables are meant to never change during the program. This type of variable is known as a constant. It uses the final modifier to ensure the variable never changes.

## Static imports 
We use static imports to import static members of a class and not classes by themselves ie *static methods* and *static instance variables*

import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;
static import java.util.Arrays.*; // DOES NOT COMPILE import must come before static
public class BadStaticImports {
public static void main(String[] args) {
    Arrays.asList("one"); // DOES NOT COMPILE
} }

Line 1 tries to use a static import to import a class. Remember that static imports are
only for importing static members. Regular imports are for importing a class. Line 3 tries
to see if you are paying attention to the order of keywords. The syntax is import static
and not vice versa. Line 6 is sneaky. We imported the asList method on line 2. However,
we did not import the Arrays class anywhere. This makes it okay to write asList("one");
but not Arrays.asList("one");

The compiler will complain if you try to explicitly do a static import of two methods with the same name or two static variables with the same name. For example:
import static statics.A.TYPE; // DOES NOT COMPILE
import static statics.B.TYPE; // DOES NOT COMPILE

## Method Overloading
Method overloading occurs when there are different method signatures with the same name but different type parameters.

public void fly(int numMiles) { }
public void fly(short numFeet) { }
public boolean fly() { return false; }
void fly(int numMiles, short numFeet) { }
public void fly(short numFeet, int numMiles) throws Exception { }

As you can see, we can overload by changing anything in the parameter list. We can have a different type, more types, or the same types in a different order. Also notice that the access modifier and exception list are irrelevant to overloading. Now let’s look at an example that is not valid overloading

public class Plane {
public void fly(int i) {
System.out.print("int ");
}
public void fly(long l) {
System.out.print("long ");
}
public static void main(String[] args) {
Plane p = new Plane();
p.fly(123);
p.fly(123L);
} }

The answer is int long. The fi rst call passes an int and sees an exact match. The second call passes a long and also sees an exact match. If we comment out the overloaded method with the int parameter list, the output becomes long long. Java has no problem calling a larger primitive. However, it will not do so unless a better match is not found. Note that Java can only accept wider types. An int can be passed to a method taking a long parameter. Java will not automatically convert to a narrower type. If you want to pass a long to a method taking an int parameter, you have to add a cast to explicitly say narrowing is okay.
 * ORDER OVERLOAD METHOD FOLLOWS
- Exact match by type - public String glide(int i, int j) {}
- Larger primitive type - public String glide(long i, long j) {}
- Autoboxed type - public String glide(Integer i, Integer j) {}
- Varargs - public String glide(int... nums) {}

public class TooManyConversions {
public static void play(Long l) { }
public static void play(Long... l) { }
public static void main(String[] args) {
play(4); // DOES NOT COMPILE
play(4L); // calls the Long version
} }

Here we have a problem. Java is happy to convert the int 4 to a long 4 or an Integer 4.
It cannot handle converting in two steps to a long and then to a Long. If we had public
static void play(Object o) { }, it would match because only one conversion would be
necessary: from int to Integer. An Integer is an Object

## Constructor
- A constructor is a special method that matches the name of the class and has no return type.
- Constructors are used when creating a new object. This process is called instantiation because it creates a new instance of the class. A constructor is called when we write new followed by the name of the class we want to instantiate. For example:
*new Bunny()*
- A constructor is typically used to initialize instance variables. The *this* keyword tells Java you want to reference an instance variable.
- Without coding the constructor, java automaticlly creates one for you with no paramaters ie *NoArgsConstructor* which is the default constructor which has an empty paramter list and an empty body 
- Having a private constructor in a class tells the compiler not to provide a default no-argument constructor. It also prevents other classes from instantiating the class. This is useful when a class only has static methods or the class wants to control all calls to create new instances of itself.
- You can have multiple constructors in the same class as long as they have different method signatures
NOTE: Constructors can be called only with the new keyword.
- If we want one of our constructors to call the otehr, we would call with a new keyword withion the first constructor but it will not do ewhat we want
    ```java
    public Hamster(int weight) {
        new Hamster(weight, "brown"); // Compiles but does not do what we want because it creates the object with first constructor and discards the new object
    }

    ```
 - The constructor is part of the initialization process, so it is allowed to assign final instance variables in it. By the time the constructor completes, all final instance variables must have been set.

  ```java
  public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";
    public MouseHouse(int length, int width, int height) {
       volume = length * width * height;
    }
  }
  ```
- ### ORDER OF INITIALIZATION IN A CLASS
    1.If there is a superclass, initialize it first . For now, just say “no superclass” and go on to the next rule.
    2.Static variable declarations and static initializers in the order they appear in the file.
    3.Instance variable declarations and instance initializers in the order they appear in the file.
    4.The constructor.
  ```java
     public class InitializationOrderSimple {
        private String name = "Torchie"; // initialized fouth
        { System.out.println(name); } // initialized fith so outputs Torchie
        private static int COUNT = 0; // initialized first
        static { System.out.println(COUNT); } // initialized second so prints out 0
        static { COUNT += 10; System.out.println(COUNT); } // initialized third so print outs 10
        public InitializationOrderSimple() { //initialized last so outputs constructor
            System.out.println("constructor");
    } }
    public class CallInitializationOrderSimple {
        public static void main(String[] args){
            SYtem.out.println("read the construct");
            IInitializationOrderSimple init = new InitializationOrderSimple(); // the output is 0 10 torchie constructor and rule 1 not applied because of no super class
        }
    }
  ```
- The four rules apply if an object is instanciated and also,  if the class is reffered to without a new call, only rule one and 2 apply. The other two wait untill there is   code   to instanciate the object
- When all the statics have been initialized the main() method can run.


## Encapsulating Data
- Encapsulation means we set up the class so only methods in the class with the variables can refer to the instance variables. Callers are required to use these methods.
- Naming convention for *JavaBean*
  * properties are private (instance variables)
  * setter methods begin  with *set* e.g setName
  * getter methods begin with *get* except for Boolean methods which we use *is* e.g getName, isHappy
- Encapsulating data is helpful because it prevents callers from making uncontrolled changes to your class. Another common technique is making classes immutable so they cannot be changed at all.
- One step in making a class immutable is to omit the setters. But wait: we still want the caller to be able to specify the initial value—we just don’t want it to change after the object is created. Constructors to the rescue!
- Immutable is only measured after the object is constructed. Immutable classes are allowed to have values. They just can't change after instantiation.
- Be careful with the return types too. DO not give a return type which is mutable thogh not using setters.

## Simple Lambdas
- Functional programming is a way of writing code more declaratively. You specify what you want to do rather than dealing with the state of objects
- Functional programming uses lambda expressions to write code. A lambda expression is a block of code that gets passed around.
- Think of a lambda expression as a "mini-function" that you define on the spot
  * Normal function
```java
    public int addNumbers(int x, int y) {
      return x + y;
    }

    // lambda expression
    (x, y) -> x + y   
```
- A lambda expression is like a method that you can pass as if it were a variable
Let’s look at some examples of valid lambdas. Pretend that there are valid interfaces that
can consume a lambda with zero, one, or two String parameters.
```java
 print(() -> true); // 0 parameters
 print(a -> a.startsWith("test")); // 1 parameter
 print((String a) -> a.startsWith("test")); // 1 parameter
 print((a, b) -> a.startsWith("test"));
 print((String a, String b) -> a.startsWith("test")); // 2 parameters
```
  Notice that all of these examples have parentheses around the parameter list except the one that takes only one parameter and doesn’t specify the type. Line 3 takes 0 parameters and always returns the Boolean true. Line 4 takes one parameter and calls a method on it, returning the result. Line 5 does the same except that it explicitly defi nes the type of the variable. Lines 6 and 7 take two parameters and ignore one of them—there isn’t a rule that says you must use all defined parameters
```java
    print(a, b -> a.startsWith("test")); // DOES NOT COMPILE
    print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE
    print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE
```
  The fi rst line needs parentheses around the parameter list. Remember that the parentheses are only optional when there is one parameter and it doesn’t have a type declared. The second line is missing the return keyword. The last line is missing the semicolon

- Since Java doesn’t allow us to redeclare a local variable, the following is an issue:
*(a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE*
We tried to redeclare a, which is not allowed. By contrast, the following line is okay because it uses a different variable name:
*(a, b) -> { int c = 0; return 5;}  //COMPILES*

- Lambdas work with interfaces that have only one method. These are called functional interfaces—interfaces that can be used with functional programming
- The use predicate interface for conditional check. So having a method which which return a bolean value we can use a predicate interface
  It is a Predicte interface of generic type and has a method called test() which takes in a single parameter of any-type and returns a boolean value
- So without lambda expressions, we would first create a class to implememnt the interface we need , after which that class will be define how to implememt the method of the interface. IN our main method we create  a new object of the interface using the  class which impemented the interface and then we can call the method and use.
- With lambdas we use the interface directly

