## Understanding Exceptions

* A program can fail for just about any reason. Here are just a few possibilities:
■ The code tries to connect to a website, but the Internet connection is down.
■ You made a coding mistake and tried to access an invalid index in an array.
■ Tne method calls another with a value that the method doesn’t support.
As you can see, some of these are coding mistakes. Others are completely beyond your
control. Your program can’t help it if the Internet connection goes down. What it can do is
deal with the situation.

## Role of exceptions

* An exception is Java’s way of saying, “I give up. I don’t know what to do right now. You deal with it.” When you write a method, you can either deal with the exception or make it the calling code’s problem. A method can handle the exception case itself or make it the caller’s responsibility. You saw both in the trip to the zoo.
*The key point to remember is that exceptions alter the program flow.*

```java
public class Zoo {
public static void main(String[] args) {
System.out.println(args[0]);
System.out.println(args[1]); // line 4
 } }
```
Then you tried to call it without enough arguments:
```bash
$ javac Zoo.java
$ java Zoo Zoo
```
On line 4, Java realized there’s only one element in the array and index 1 is not allowed.
Java threw up its hands in defeat and threw an exception. It didn’t try to handle the exception.
It just said, “I can’t deal with it” and the exception was displayed:

```bash
ZooException in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1 at mainmethod.Zoo.main(Zoo.java:7)
```

- Java has a Throwable superclass for all objects that represent these events. Not all of them have the word exception in their classname, which can be confusing. 

- A runtime exception is defined as the *RuntimeException* class and its subclasses (java.lang.RuntimeException). Runtime exceptions tend to be unexpected but not necessarily fatal. For example, accessing an invalid array index is unexpected. Runtime exceptions are also known as unchecked exceptions.

- A checked exception includes Exception and all subclasses that do not extend RuntimeException (java.lang.Exception). Checked exceptions tend to be more anticipated—for example, trying to read a file that doesn’t exist.
Checked exceptions? What are we checking? Java has a rule called the *handle* or *declare*
rule. For checked exceptions, Java requires the code to either handle them or declare them in the method signature.
For example, this method declares that it might throw an exception:

```java
void fall() throws Exception {
throw new Exception();
}
```
- *throw* tells Java that you want to throw an Exception. *throws* simply declares that the method might throw an Exception , it also might not.

- An example of a runtime exception is a *NullPointerException*, which happens when you try to call a member on a null reference.

## Throwing an Exception

- Any Java code can throw an exception; this includes code you write. For the OCP exam, you’ll learn how to create your own exception classes. The OCA exam is limited to exceptions that someone else has created.
- The second way for code to result in an exception is to explicitly request Java to throw one. Java lets you write statements like these:
```java
throw new Exception();
throw new Exception("Ow! I fell.");
throw new RuntimeException();
throw new RuntimeException("Ow! I fell.");
```
The throw keyword tells Java you want some other part of the code to deal with the
exception. Someone else needs to figure out what to do about the exception.

* Runtime exception (unchecked exception)
- Subclass of RuntimeException
- Okay for a program to catch
- Not required for a program to handle or declare

* Checked Exception
- Subclass of Exception but not subclass of RuntimeException
- OKay for program to catch
- Required for a program to handle or declare

* Error 
- Subclass of Error
- Not okay for program to catch
- Not required for program to handle 
