## Calling Methods That Throw Exceptions
- Declaring an unused exception isn’t considered unreachable code. It gives the method the option to change the implementation to throw that exception in the future.
```java
public void bad() {
try {
eatCarrot();
} catch (NoMoreCarrotsException e ) {// DOES NOT COMPILE
System.out.print("sad rabbit");
}
}
public void good() throws NoMoreCarrotsException {
eatCarrot();
}
private static void eatCarrot() { } // throws no exception so no need to handle or catch one
```
Java knows that eatCarrot() can’t throw a checked exception—which means there’s no
way for the catch block in bad() to be reached. In comparison, good() is free to declare
other exceptions.

## Subclassess
- When a class overrides a method from a superclass or implements a method from an interface, it’s not allowed to add new checked exceptions to the method signature.
```java
class CanNotHopException extends Exception { }
class Hopper {
public void hop() { }
}
class Bunny extends Hopper {
public void hop() throws CanNotHopException { } // DOES NOT COMPILE
}
```
* Java knows hop() isn’t allowed to throw any checked exceptions because the superclass Hopper doesn’t declare any. Imagine what would happen if subclasses could add checked exceptions—you could write code that calls Hopper’s hop() method and not handle any exceptions. Then if Bunny was used in its place, the code wouldn’t know to handle or declare CanNotHopException.

A subclass is allowed to declare fewer exceptions than the superclass or interface. This is legal because callers are already handling them.
```java
class Hopper {
public void hop() throws CanNotHopException { }
}
class Bunny extends Hopper {
public void hop() { }
}
```
A subclass not declaring an exception is similar to a method declaring it throws an exception that it never actually throws. This is perfectly legal. Similarly, a class is allowed to declare a subclass of an exception type. The idea is the same. The superclass or interface has already taken care of a broader type. Here’s an example:
```java
class Hopper {
public void hop() throws Exception { }
}
class Bunny extends Hopper {
public void hop() throws CanNotHopException { }
}
```
Bunny could declare that it throws Exception directly, or it could declare that it throws a
more specific type of Exception. It could even declare that it throws nothing at all.This rule applies only to checked exceptions. The following code is legal because it has a runtime exception in the subclass’s version:
```java
class Hopper {
public void hop() { }
}
class Bunny extends Hopper {
public void hop() throws IllegalStateException { }
}
```

## Printing an Exception
There are three ways to print an exception. 
- You can let Java print it out
- Print just the message or 
- Print where the stack trace comes from.

