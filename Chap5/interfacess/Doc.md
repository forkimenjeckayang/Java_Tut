## Defining an interface
- It may be helpful to think of an interface as a specialized kind of abstract class, since it shares many of the same properties and rules as an abstract class.

1. Interfaces cannot be instantiated directly.
2. An interface is not required to have any methods.
3. An interface may not be marked as final.
4. All top-level interfaces are assumed to have public or default access, and they must include the abstract modifier in their definition. Therefore, marking an interface as private, protected, or final will trigger a compiler error, since this is incompatible with these assumptions.
5. All non-default methods in an interface are assumed to have the modifiers abstract and public in their definition. Therefore, marking a method as private, protected, or final will trigger compiler errors as these are incompatible with the abstract and public keywords.
* The fourth rule doesn’t apply to inner interfaces, although inner classes and interfaces
are not in scope for the OCA exam. The fi rst three rules are identical to the fi rst three rules
for creating an abstract class

- abstract identifier and public access odifier , are assumed. In other words, whether or not you provide them, the compiler will automatically insert them as part of the method definition.
 * You may provide these modifiers yourself, although the compiler will insert them automatically if you do not. For example, the following two interface definitions are equivalent, as the compiler will convert them both to the second example:
```java
public interface CanFly {
 void fly(int speed);
 abstract void takeoff();
 public abstract double dive();
}

public abstract interface CanFly {
public abstract void fly(int speed);
public abstract void takeoff();
public abstract double dive();
}
```
* In this example, the abstract keyword is first automatically added to the interface definition. Then, each method is prepended with abstract and public keywords. If the method already has either of these keywords, then no change is required.

- A class may implement multiple interfaces, each separated by a comma, such as in the following example:
```java
public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {
}
```
* In the example, if any of the interfaces defined abstract methods, the concrete class Elephant would be required to implement those methods

-
```java
private final interface CanCrawl { // DOES NOT COMPILE
private void dig(int depth); // DOES NOT COMPILE
protected abstract double depth(); // DOES NOT COMPILE
public final void surface(); // DOES NOT COMPILE
}
```
 * Every single line of this example doesn’t compile. The first line doesn’t compile for two
reasons. First, it is marked as final, which cannot be applied to an interface since it conflicts with the assumed abstract keyword. Next, it is marked as private, which conflicts with the public or default required access for interfaces. The second and third line do not compile because all interface methods are assumed to be public and marking them as private or protected throws a compiler error.

## Inheriting an Interface
1. An interface that extends another interface, as well as an abstract class that implements an interface, inherits all of the abstract methods as its own abstract methods.
2. The first concrete class that implements an interface, or extends an abstract class that implements an interface, must provide an implementation for all of the inherited abstract methods.

- A class can extend only one class but and interface can extend  many interfaces
- Although a class can implement an interface, a class cannot extend an interface. Likewise, whereas
an interface can extend another interface, an interface cannot implement another interface.
  * a classes can extend a single class // single inheritance
  * an interfaces can extend multiple interfaces // multiple inheritance
  * a class implements an interface or multiple interfaces
  * an interface cannot implement another interface

- It is not possible in Java to define two methods in a class with the same name and input parameters but different return types. Given the following two interface definitions for Herbivore and Omnivore, the following code will not compile:
```java

public interface Herbivore {
public int eatPlants();
}

public interface Omnivore {
public void eatPlants();
}

public class Bear implements Herbivore, Omnivore {
public int eatPlants() { // DOES NOT COMPILE
System.out.println("Eating plants: 10");
return 10;
}

public void eatPlants() { // DOES NOT COMPILE
System.out.println("Eating plants");
}
}
```
- The compiler would also throw an exception if you define an interface or abstract class
that inherits from two conflicting interfaces, as shown here:
```java
public interface Herbivore {
public int eatPlants();
}
public interface Omnivore {
public void eatPlants();
}
public interface Supervore extends Herbivore, Omnivore {} // DOES NOT COMPILE
public abstract class AbstractBear implements Herbivore, Omnivore {} // DOES NOT COMPILE
```
Even without implementation details, the compiler detects the problem with the
abstract definition and prevents compilation.

## Interface Variables
- Like interface methods, interface variables are assumed to be public.
 1. Interface variables are assumed to be *public*, *static*, and *final*. Therefore, marking a variable as private or protected will trigger a compiler error, as will marking any variable as abstract.
 2. The value of an interface variable must be set when it is declared since it is marked as final.
- In this manner, interface variables are essentially constant variables defi ned on the interface level. Because they are assumed to be static, they are accessible even without an instance of the interface.

## Default Interface Methods
- A default method is a method defined within an interface with the default keyword in which a method body is provided. Contrast default methods with *“regular”* methods in an interface, which are assumed to be abstract and may not have a method body.
- classes have the option to override the default method if they need to, but they are not required to do so. If the class doesn’t override the method, the default implementation will be used. In this manner, the method defi nition is concrete, not abstract.
- The following is an example of a default method defi ned in an interface:
```java
public interface IsWarmBlooded {
boolean hasScales();
public default double getTemperature() {
return 10.0;
}
}
```
* This example defines two interface methods, one is a normal abstract method and the other a default method. Note that both methods are assumed to be public, as all methods of an interface are all public. The first method is terminated with a semicolon and doesn’t provide a body, whereas the second default method provides a body. Any class that implements IsWarmBlooded may rely on the default implementation of getTemperature() or override the method and create its own version.

* Note that the default access modifier as defined in Chapter 4 is completely different from
the default method defined in this chapter. We defined a default access modifier in Chapter 4 as
lack of an access modifier, which indicated a class may access a class, method, or value within
another class if both classes are within the same package. In this chapter, we are specifically
talking about the keyword default as applied to a method within an interface. Because all
methods within an interface are assumed to be public, the access modifier for a default method is therefore public.
- ## default interface method rules
1. A default method may only be declared within an interface and not within a class or abstract class.
2. A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
3. A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class that implements the interface.
4. Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected.

- Finally, the interface may redeclare the method as abstract, requiring classes that implement the new interface to explicitly provide a method body. Analogous options apply for an abstract class that implements an interface.

## Default Methods and Multiple Inheritance
- By allowing default methods in interfaces, coupled with the fact a class may implement multiple interfaces, Java has essentially opened the door to multiple inheritance problems. For example, what value would the following code output?

```java
public interface Walk {
public default int getSpeed() {
return 5;
}
}
public interface Run {
public default int getSpeed() {
return 10;
}
}

public class Cat implements Walk, Run { // DOES NOT COMPILE
public static void main(String[] args) {
System.out.println(new Cat().getSpeed());
}
}
```
* Cat inherits the two default methods for getSpeed(), so which does it use? Since Walk and Run are considered siblings in terms of how they are used in the Cat class, it is not clear whether the code should output 5 or 10. The answer is that the code outputs neither value—it fails to compile.

* If a class implements two interfaces that have default methods with the same name and signature, the compiler will throw an error. 
There is an exception to this rule, though: if the subclass overrides the duplicate default methods, the code will compile without issue—the ambiguity about which version of the method to call has been removed. For example, the following modified implementation of Cat will compile and output 1:
```java
public class Cat implements Walk, Run {
public int getSpeed() {
return 1;
}
public static void main(String[] args) {
System.out.println(new Cat().getSpeed());
}
}
```
* You can see that having a class that implements or inherits two duplicate default methods forces the class to implement a new version of the method, or the code will not compile. This rule holds true even for abstract classes that implement multiple interfaces, becausethe default method could be called in a concrete method within the abstract class. 

## Static Interface Methods
A static method defined in an interface is not inherited in any classes that implement the interface.
Here are the static interface method rules you need to be familiar with:

1. Like all methods in an interface, a static method is assumed to be public and will not
compile if marked as private or protected.
2. To reference the static method, a reference to the name of the interface must be used.