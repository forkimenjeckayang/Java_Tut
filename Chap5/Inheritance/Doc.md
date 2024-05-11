## Inheritance
- *Inheritance* is the process by which the new child subclass automatically includes any public or protected primitives, objects, or methods defined in the parent class.
- Java supports *single inheritance*, by which a class may inherit from only one direct parent class. 
- Java also supports multiple levels of inheritance, by which one class may extend another class, which in turn extends another class. You can extend a class any number of times, allowing each descendent to gain access to its ancestor’s members.
- Classes may implement multiple interfaces, but can extend only one parent class and not multiple parent classes. But it doesn't stop parent classes from having  multiple children classes
- Part of what makes multiple inheritance complicated is determining which parent to inherit values from in case of a confl ict. For example, if you have an object or method defi ned in all of the parents, which one does the child inherit? There is no natural ordering for parents in this example which is why Java avoids these issues by disallowing multiple inheritance altogether.
- You can apply access modifiers (public, private, protected,default) to both class methods and variables.
- A  java file can have many class within it but at most only one public class or no pulic class at all. Using the default access modifier in creating classes will enable that
- Also you cannot have a public and private class in one jave file.
- The rules for applying class access modifiers are identical for interfaces. There can be at most one public class or interface in a Java file
- In Java, all classes inherit from a single class,*java.lang.Object*. java.lang.Object is the only class that doesn’t have any parent classes.

```java
   public class Zoo {
   }
   public class Zoo extends java.lang.Object {
   }
```
The key is that when Java sees you defi ne a class that doesn’t extend another class, it immediately adds the syntax extends java.lang.Object to the class definition. If you define a new class that extends an existing class, Java doesn’t add this syntax, although the new class still inherits from java.lang.Object.
- In Java, the fi rst statement of every constructor is either a call to another constructor within the class, using *this()*, or a call to a constructor in the direct parent class, using *super()*.
- Like the this() command, the super() command may only be used as the first statement of the constructor or the code will not compile
```java
  public class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
        super(); // DOES NOT COMPILE
    }
  }
  public class Zoo {
    public Zoo() {
        super();
        System.out.println("Zoo created");
        super(); // DOES NOT COMPILE
    }
  }
```
- If a child class extends from a parent class which has invoked a parent constructor in its constructor, then the child class must also define a constructor which also explicity makes a call to the parent constructor in it's constructor.

## Understanding Compiler Enhancements
Up to now, we defined numerous classes that did not explicitly call the parent constructor via the super() keyword, so why did the code compile? The answer is that the Java compiler automatically inserts a call to the no-argument constructor super() if the first statement is not a call to the parent constructor.

## Constructor Rules
- The first statement of every constructor is a call to another constructor within the class using this(), or a call to a constructor in the direct parent class using super().
- The super() call may not be used after the first statement of the constructor.
- If no super() call is declared in a constructor, Java will insert a no-argument super() as the first statement of the constructor.
- If the parent doesn’t have a no-argument constructor and the child doesn’t define any constructors, the compiler will throw an error and try to insert a default no-argument constructor into the child class.
- If the parent doesn’t have a no-argument constructor, the compiler requires an explicit call to a parent constructor in each child constructor.

## Calling Constructors
- In Java, the parent constructor is always executed before the child constructor.

## super() vs. super
- As discussed in Chapter 4, *this()* and *this* are unrelated in Java. Likewise, *super()* and *super* are quite different but may be used in the same methods on the exam. The ﬁrst, super(), is a statement that explicitly calls a parent constructor and may only be used in the ﬁrst line of a constructor of a child class. The second, super, is a keyword used to reference a member deﬁned in a parent class and may be used throughout the child class.
The exam may try to trick you by using both super() and super in a constructor. For
example, consider the following code:
```java
  public Rabbit(int age) {
    super();
    super.setAge(10);
  }
```
- The ﬁrst statement of the constructor calls the parent’s constructor, whereas the second statement calls a function deﬁned in the parent class. Contrast this with the following code, which doesn’t compile:
```java
  public Rabbit(int age) {
    super; // DOES NOT COMPILE
    super().setAge(10); // DOES NOT COMPILE
  }
```
## Inheriting Methods
- Inheriting a class grants us access to the public and protected members of the parent class, but also sets the stage for collisions between methods defi ned in both the parent class and the subclass
   * Overriding a Method : You can override a method in the parent class by declaring a new method   with the signature and return type as the method in the parent class.
   - When you override a method, you may reference the parent version of the method using the super keyword.
   - Overriding a method is not without limitations, though. The compiler performs the following checks when you override a non-private method:
    1. The method in the child class must have the same signature *(method name & parameters)* as the method in the parent class
    2. The method in the child class must be at least as accessible or more accessible than the   method in the parent class.
    3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
    4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types

## Overloading vs. Overriding

```java
public class Bird {
public void fly() {
System.out.println("Bird is flying");
}
public void eat(int food) {
System.out.println("Bird is eating "+food+" units of food");
}
}
public class Eagle extends Bird {
public int fly(int height) {
System.out.println("Bird is flying at "+height+" meters");
return height;
}
public int eat(int food) { // DOES NOT COMPILE
System.out.println("Bird is eating "+food+" units of food");
return food;
}
}
```
* The ﬁrst method, fly(), is overloaded in the subclass Eagle, since the signature changes from a no-argument constructor to a constructor with one int argument. *Because the method is being overloaded and not overridden, the return type can be changed from void to int without issue.*
* The second method, eat(), is overridden in the subclass Eagle, since the signature is the same as it is in the parent class Bird—they both take a single argument int. Because the method is being overridden, the return type of the method in Eagle must be a subclass of the return type of the method in Bird. In this example, the return type void is not a sub-class of int; therefore, the compiler will throw an exception on this method deﬁnition.

```java 
public class Camel {
protected String getNumberOfHumps() {
return "Undefined";
}
}
public class BactrianCamel extends Camel {
private int getNumberOfHumps() { // DOES NOT COMPILE
return 2;
}
}
```
* In this example, the method in the child class doesn’t compile for two reasons. First, it violates the second rule of overriding methods: the child method must be at least as accessible as the parent. In the example, the parent method uses the protected modifier, but the child method uses the private modifier, making it less accessible in the child method than in the parent method.
* It also violates the fourth rule of overriding methods: the return type of the parent method and child method must be covariant. In this example, the return type of the parent method is String, whereas the return type of the child method is int, neither of which is covariant with each other.

```java
public class Reptile {
protected boolean hasLegs() throws InsufficientDataException {
throw new InsufficientDataException();
}
protected double getWeight() throws Exception {
return 2;
}
}
public class Snake extends Reptile {
protected boolean hasLegs() {
return false;
}
protected double getWeight() throws InsufficientDataException{
return 2;
}
}
```
* Both parent and child classes define two methods, hasLegs() and getWeight(). The first method, hasLegs(), throws an exception InsufficientDataException in the parent class but doesn’t throw an exception in the child class. This does not violate the third rule of overriding methods, though, as no new exception is defined. In other words, a child method may hide or eliminate a parent method’s exception without issue.
* The second method, getWeight(), throws Exception in the parent class and InsufficientDataException in the child class. This is also permitted, as InsufficientDataException is a subclass of Exception by construction. Neither of the methods in the previous example violates the third rule of overriding
methods, so the code compiles and runs without issue.

```java
public class InsufficientDataException extends Exception {}
public class Reptile {
protected double getHeight() throws InsufficientDataException {
return 2;
}
protected int getLength() {
return 10;
}
}
public class Snake extends Reptile {
protected double getHeight() throws Exception { // DOES NOT COMPILE
return 2;
}
protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
return 10;
}
}
```
* Unlike the earlier example, neither of the methods in the child class of this code will compile. The getHeight() method in the parent class throws an InsufficientDataException,whereas the method in the child class throws an Exception. Since Exception is not a subclass of InsufficientDataException, the third rule of overriding methods is violated and the code will not compile. Coincidentally, Exception is a superclass of InsufficientDataException.
* Next, the getLength() method doesn’t throw an exception in the parent class, but it does throw an exception, InsufficientDataException, in the child class. In this manner, the child class defines a new exception that the parent class did not, which is a violation of the third rule of overriding methods.

## Redeclaring private Methods
- In Java, it is not possible to override a private method in a parent class since the parent method is not accessible from the child class. Just because a child class doesn’t have access to the parent method, doesn’t mean the child class can’t define its own version of the method. It just means, strictly speaking, that the new method is not an overridden version of the parent class’s method.Java permits you to redeclare a new method in the child class with the same or modified signature as the method in the parent class so none of the rules for overriding methods are invoked.

```java
public class Camel {
private String getNumberOfHumps() {
return "Undefined";
}
}
public class BactrianCamel extends Camel {
private int getNumberOfHumps() {
return 2;
}
}
```
- This code compiles without issue. Notice that the return type differs in the child method from String to int. In this example, the method getNumberOfHumps() in the parent class is hidden, so the method in the child class is a new method and not an override of the method in the parent class. As you saw in the previous section, if the method in the parent class were public or protected, the method in the child class would not compile because it would violate two rules of overriding methods. The parent method in this example is private, so there are no such issues.

## Hiding Static Methods
- A hidden method occurs when a child class defines a static method with the same name and signature as a static method defined in a parent class. Method hiding is similar but not exactly the same as method overriding. First, the four previous rules for overriding a method must be followed when a method is hidden. In addition, a new rule is added for hiding a method, namely that the usage of the static keyword must be the same between parent and child classes.
  5. The method defined in the child class must be marked as static if it is marked as static in the parent class (method hiding). Likewise, the method must not be marked as static in the child class if it is not marked as static in the parent class (method overriding).

## Overriding vs. Hiding Methods
- At runtime the child version of an overridden method is always executed for an instance regardless of whether the method call is defined in a parent or child class method. In this manner, the parent method is never used unless an explicit call to the parent method is referenced, using the syntax *ParentClassName.method()*. Alternatively, at runtime the parent version of a hidden method is always executed if the call to the method is defined in the parent class.

## Creating final Method
- Final methods cannot be overwritten
- You’d mark a method as final when you’re deﬁning a parent class and want to guarantee certain behavior of a method in the parent class, regardless of which child is invoking the method.

## Inheriting Variables
- Java doesn’t allow variables to be overridden but instead hidden.
- When you hide a variable, you define a variable with the same name as a variable in a parent class
- If you’re referencing the variable from within the parent class, the variabledefined in the parent class is used. Alternatively, if you’re referencing the variable from within a child class, the variable defi ned in the child class is used. Likewise, you can reference the parent value of the variable with an explicit use of the super keyword.
- We do not overide a member variable but instead hide it in an inherited class
## NOTE: Although Java allows you to hide a variable deﬁned in a parent class with one deﬁned in a child class, it is considered an extremely poor coding practice. Hiding variables makes the code very confusing and difﬁcult to read, especially if you start modifying the value of the variable in both the parent and child methods, since it may not be clear which variable you’re updating.


## Abstract Class Deﬁnition Rules:

1. Abstract classes cannot be instantiated directly.
2. Abstract classes may be defined with any number, including zero, of abstract and non-abstract methods.
3. Abstract classes may not be marked as private or final.
4. An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.
5. The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.

## Abstract Method Deﬁnition Rules:

1. Abstract methods may only be defined in abstract classes.
2. Abstract methods may not be declared private or final.
3. Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
4. Implementing an abstract method in a subclass follows the same rules for overriding a method. For example, the name and signature must be the same, and the visibility of the method in the subclass must be at least as accessible as the method in the parent class.
