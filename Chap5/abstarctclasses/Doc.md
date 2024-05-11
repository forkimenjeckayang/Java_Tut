## Abstract Classes
- We make classes abstract becasue we want to make classes which extend these classes have an implementation for the methods in the class
- An abstract class is a class that is marked with the abstract keyword and cannot be instantiated.
- An abstract method is a method marked with the abstract keyword defi ned in an abstract class, for which no implementation is provided in the class in which it is declared.
- An abstract class may include nonabstract methods and variables, as you saw with the variable age and the method eat(). In fact, an abstract class is not required to include any abstract methods.
- Although an abstract class doesn’t have to implement any abstract methods, an abstract method may only be defined in an abstract class.
```java
public class Chicken {
    public abstract void peck(); // DOES NOT COMPILE
}
/*
 * abstract methods within a abstract class are like this 
 *  public abstract String getName();
 * as for this below through they are abstract methods they donot compile
 * public abstract void swim() {} // does not compile
 * public abstract int getAge() { // does not compile
 *  return 10;
 * }
 * 
*/
```
- Although you can’t provide a default implementation to an abstract method in an abstract class, you can still deﬁne a method with a body—you just can’t mark it as abstract. As long as you do not mark it as final, the subclass still has the option to override it, as explained in the previous section.
- By definition, an abstract class is one that must be extended by another class to
be instantiated, whereas a final class can’t be extended by another class. By marking an
abstract class as final, you’re saying the class can never be instantiated, so the compiler
refuses to process the code. For example, the following code snippet will not compile:
```java
public final abstract class Tortoise { // does not compile
}
```
- Likewise, an abstract method may not be marked as final for the same reason that an abstract class may not be marked as final. Once marked as final, the method can never be overridden in a subclass, making it impossible to create a concrete instance of the abstract class.

```java
public abstract class Goat {
public abstract final void chew(); // does not compile
}
```
- Finally, a method may not be marked as both abstract and private. This rule makes sense if you think about it. How would you defi ne a subclass that implements a required method if the method is not accessible by the subclass itself? The answer is you can’t, which is why the compiler will complain if you try to do the following:

```java
public abstract class Whale {
    private abstract void sing(); //does not compile
}
public class HumpbackWhale extends Whale {
    private void sing() {
        System.out.println("Humpback whale is singing");
    }
}
```
* The abstract method sing() defined in the parent class Whale is not visible to the subclass HumpbackWhale. Even though HumpbackWhale does provide an implementation, it is not considered an override of the abstract method since the abstract method is unreachable.

- *Abstract classes cannot be instanciated*
  Eel eel = new Eel(); // DOES NOT COMPILE given Eel is an abstract class

- An abstract class becomes useful when it is extended by a concrete subclass. A concrete class is the first non-abstract subclass that extends an abstract class and is required to implement all inherited abstract methods.
- An abstract class class extend another abstract class without providing the impelementation of abstract methods and it still works fine
- Abstract classes can extend other abstract classes and are not required to provide implementations for any of the abstract methods.
- 
