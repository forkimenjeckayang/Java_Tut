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
