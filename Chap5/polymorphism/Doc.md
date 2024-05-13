## Polymorphism
- Java supports polymorphism ie  the property of an object to take on many different forms.
- Java object may be accessed using a reference with the same type as the object, a reference that is a superclass of the object, or a reference that defi nes an interface the object implements either directly or through a superclass.
- Regardless of the type of the reference you have for the object in memory, the object itself doesn’t change. For example, since all objects inherit java.lang.Object, they can all be reassigned to java.lang.Object.
```java
Lemur lemur = new Lemur();
Object lemurAsObject = lemur;
```
Even though the Lemur object has been assigned a reference with a different type, the object itself has not changed and still exists as a Lemur object in memory. What has changed, then, is our ability to access methods within the Lemur class with the lemurAsObject reference. Without an explicit cast back to Lemur, as you’ll see in the next section, we no longer have access to the Lemur properties of the object.
We can summarize this principle with the following two rules:
1. The type of the object determines which properties exist within the object in memory.
2. The type of the reference to the object determines which methods and variables are accessible to the Java program.
- It therefore follows that successfully changing a reference of an object to a new reference type may give you access to new properties of the object, but those properties existed before the reference change occurred.

## Casting Objects

1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
2. Casting an object from a superclass to a subclass requires an explicit cast.
3. The compiler will not allow casts to unrelated types.
4. Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actually an instance of that class.

```java
public class Rodent {
}
public class Capybara extends Rodent {
public static void main(String[] args) {
Rodent rodent = new Rodent();
Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime
}
}
```
* This code creates an instance of Rodent and then tries to cast it to a subclass of Rodent, Capybara. Although this code will compile without issue, it will throw a ClassCastException at runtime since the object being referenced is not an instance of the Capybara class. The thing to keep in mind in this example is the object that was created is not related to the Capybara class in any way.

## Virtual Methods
* A virtual method is a method in which the specific implementation is not determined until runtime. In fact, all *non-final*, *non-static*, and *non-private* Java methods are considered virtual methods, since any of them can be overridden at runtime. What makes a virtual method special in Java is that if you call a method on an object that overrides a method, you get the overridden method, even if the call to the method is on a parent reference or within the parent class.

## Polymorphic Parameters
One of the most useful applications of polymorphism is the ability to pass instances of a subclass or interface to a method. For example, you can define a method that takes an instance of an interface as a parameter. In this manner, any class that implements the interface can be passed to the method. Since you’re casting from a subtype to a supertype, an explicit cast is not required. This property is referred to as polymorphic parameters of a method.

## Polymorphism and Method Overriding