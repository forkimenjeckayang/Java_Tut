## Using A try Statement

- Java uses a try statement to separate the logic that might throw an exception from the logic to handle that exception.
- The code in the try block is run normally. If any of the statements throw an exception that can be caught by the exception type listed in the catch block, the try block stops running and execution goes to the catch statement. If none of the statements in the try block throw an exception that can be caught, the catch clause is not run.

- Now let’s look at some invalid try statements that the exam might try to trick you with. Do you see what’s wrong with this one?
```java
try // DOES NOT COMPILE
fall();
catch (Exception e)
System.out.println("get up");
```
- The problem is that the braces are missing. It needs to look like this:
```java
try {
fall();
} catch (Exception e) {
System.out.println("get up");
}
```
- Try statements are like methods in that the curly braces are required even if there is only one statement inside the code blocks. if statements and loops are special in this respect as they allow you to omit the curly braces.
```java
try {// DOES NOT COMPILE
fall();
}
```
- This code doesn’t compile because the try block doesn’t have anything after it. Remember, the point of a try statement is for something to happen if an exception is thrown. Without another clause, the try statement is lonely.

## Adding a finally Block

- The try statement also lets you run code at the end with a finally clause regardless of whether an exception is thrown. The finally clause and  block runs regardless if an exception was thrown or not.
- If an exception is thrown, the finally block is run after the catch block. If no exception is thrown, the finally block is run after the try block completes.
* NOTE:
-You cannot have a try block alone
-You cannot have a try, finally and catch block in that order
-You can have a try block and a catch block by itself
-You can have a try block and a finally block by itself
-Catch is not required if finally is present and vise versa

- *finally* is typically used to close resources such as fi les or databases—both of
which are topics on the OCP exam.
- There is one exception to “*the finally block always runs after the catch block”* rule. Java deﬁnes a method that you call as System.exit(0);. The integer parameter is the error code that gets returned. When *System.exit* is called in the try or catch block, finally does not run...

## Catching Various Types of Exceptions

- First, you must be able to recognize if the exception is a checked or an unchecked exception
- Second, you need to determine if any of the exceptions are subclasses of the others.
```java
class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }
```
* In this example, there are three custom exceptions. All are unchecked exceptions because they directly or indirectly extend RuntimeException. Now we catch both types of exceptions and handle them by printing out the appropriate message:
```java
public void visitPorcupine() {
try {
seeAnimal();
} catch (AnimalsOutForAWalk e) {// first catch block
System.out.print("try back later");
} catch (ExhibitClosed e) {// second catch block
System.out.print("not today");
}
}
```
* There are three possibilities for when this code is run. If seeAnimal() doesn’t throw an
exception, nothing is printed out. 
* If the animal is out for a walk, only the first catch block runs. 
* If the exhibit is closed, only the second catch block runs. 
A rule exists for the order of the catch blocks. Java looks at them in the order they appear.

*If it is impossible for one of the catch blocks to be executed, a compiler error about unreachable code occurs*. 
* This happens when a superclass is caught before a subclass.
Remember, we warned you to pay attention to any subclass exceptions.
In the porcupine example, the order of the catch blocks could be reversed because the exceptions don’t inherit from each other. And yes, we have seen a porcupine be taken for a walk on a leash.
The following example shows exception types that do inherit from each other:
```java
public void visitMonkeys() {
try {
seeAnimal();
} catch (ExhibitClosedForLunch e) {// subclass exception
System.out.print("try back later");
} catch (ExhibitClosed e) {// superclass exception
System.out.print("not today");
}
}
```
* If the more specific ExhibitClosedForLunch exception is thrown, the first catch block runs. If not, Java checks if the superclass ExhibitClosed exception is thrown and catches it. This time, the order of the catch blocks does matter. The reverse does not work.
```java
public void visitMonkeys() {
try {
seeAnimal();
} catch (ExhibitClosed e) {
System.out.print("not today");
} catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE
System.out.print("try back later");
}
}
```
* This time, if the more specific ExhibitClosedForLunch exception is thrown, the catch block for ExhibitClosed runs—which means there is no way for the second catch block to ever run. Java correctly tells us there is an unreachable catch block.

## Throwing a Second Exception

- A catch or finally block can have any valid Java code in it—including another try statement.
The following code tries to read a file:
```java
 public static void main(String[] args) {

    FileReader reader = null;
    try {
        reader = read();
    } catch (IOException e) {
        try {
            if (reader != null) reader.close();
        } catch (IOException inner) {
        }
      }
    }
 private static FileReader read() throws IOException {// CODE GOES HERE
 }
```
* The easiest case is if line 28 doesn’t throw an exception. Then the entire catch block on lines 20–25 is skipped. Next, consider if line 28 throws a NullPointerException. That isn’t
an IOException, so the catch block on lines 20–25 will still be skipped. If line 28 does throw an IOException, the catch block on lines 20–25 does get run. Line 22 tries to close the reader. If that goes well, the code completes and the main() method ends normally. If the close() method does throw an exception, Java looks for more catch blocks. There aren’t any, so the main method throws that new exception. Regardless, the exception on line 28 is handled. A different exception might be thrown, but the one from line 28 is done.

* In Java, when a finally block throws an exception, it's possible for the exception in the finally block to be propagated instead of the exception from the try or catch block. This behavior can be a bit surprising, but it's important to understand how it works.

Here's a simple example to illustrate this:
```java
try {
    // some code that might throw an exception
    throw new RuntimeException("try block");
} catch (Exception e) {
    // some code that handles the exception
    System.out.println("Caught exception in catch block: " + e.getMessage());
    throw e; // re-throw the exception
} finally {
    // some code that runs no matter what
    // but in this case, it throws an exception
    throw new RuntimeException("finally block");
}
```
- In this example, the try block throws a RuntimeException. The catch block catches the exception, prints a message, and then re-throws the exception. The finally block also throws an exception. The exception from the finally block is propagated instead of the exception from the try or catch block.
This behavior can be explained by the fact that the finally block is executed even if an exception is thrown in the try or catch block. If the finally block throws an exception, it's propagated instead of the original exception, unless the original exception is re-thrown in the catch block.
So the catch block that also throws an exception is not always considered when the finally block throws an exception. Instead, the exception from the finally block is propagated.
