## Recognizing Common Exception Types
- You need to recognize three types of exceptions for the OCA exam: runtime exceptions, checked exceptions, and errors.

1. Runtime Exceptions
* ArithmeticException
Thrown by the JVM when code attempts to divide by zero
* ArrayIndexOutOfBoundsException 
Thrown by the JVM when code uses an illegal index to access an array
* ClassCastException 
Thrown by the JVM when an attempt is made to cast an exception to a subclass of which it is not an instance
* IllegalArgumentException 
Thrown by the programmer to indicate that a method has been passed an illegal or inappropriate argument
* NullPointerException 
Thrown by the JVM when there is a null reference where an object is required
* NumberFormatException 
Thrown by the programmer when an attempt is made to convert a string to a numeric type but the string doesn’t have an appropriate format

2. Checked Exceptions
Checked exceptions have Exception in their hierarchy but not RuntimeException. They must be handled or declared. They can be thrown by the programmer or by the JVM.
* FileNotFoundException 
Thrown programmatically when code tries to reference a file that does not exist
* IOException 
Thrown programmatically when there’s a problem reading or writing a file

3. Errors
They extend the Error class. They are thrown by the JVM and should not be handled or declared. 
* ExceptionInInitializerError
 Thrown by the JVM when a static initializer throws an exception and doesn’t handle it
* StackOverflowError 
Thrown by the JVM when a method calls itself too many times (this is called infinite recursion because the method typically calls itself without end)
* NoClassDefFoundError 
Thrown by the JVM when a class that the code uses is available at compile time but not runtime

  - ExceptionInInitializerError
Java runs static initializers the fi rst time a class is used. If one of the static initializers
throws an exception, Java can’t start using the class. It declares defeat by throwing an ExceptionInInitializerError. This code shows an ArrayIndexOutOfBounds in a static initializer:
```java
static {
int[] countsOfMoose = new int[3];
int num = countsOfMoose[-1];
}
public static void main(String[] args) { }
```
  - StackOverflowError
When Java calls methods, it puts parameters and local variables on the stack. After doing this a very large number of times, the stack runs out of room and overflows. This is called a
StackOverflowError. Most of the time, this error occurs when a method calls itself.
```java
public static void doNotCodeThis(int num) {
doNotCodeThis(1);
}
```
```bash
The output contains this line:
Exception in thread "main" java.lang.StackOverflowError
```
Since the method calls itself, it will never end. Eventually, Java runs out of room on the
stack and throws the error. This is called infinite recursion. It is better than an infi nite loop
because at least Java will catch it and throw the error. With an infinite loop, Java just uses
all your CPU until you can kill it.

   - NoClassDefFoundError
This error won’t show up in code on the exam—you just need to know that it is an error NoClassDefFoundError occurs when Java can’t fi nd the class at runtime.

