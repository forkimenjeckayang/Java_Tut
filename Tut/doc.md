## Operators
+: Indicates a number is positive, although numbers are assumed to be positive in Java unless accompanied by a negative unary operator
-: Indicates a literal number is negative or negates an expression
++ : Increments a value by 1
-- : Decrements a value by 1
!  : Inverts a Boolean’s logical value / logical complement operator 

++y : known as pre-increment
--y : known as pre-decrement
   with this operator is assigned first and nnew value returned

y++ : known as post-increment
y-- : known as post-decrement
   with this original vale of the expression is returned before incrementing or decrementing
== : Equality operator
!= : Not equal-to operator

## Complex Operators
can be applied when a variable is already defined
+=
-=
*=
int x = 2, z = 3;
x = x * z; // Simple assignment operator
x *= z; // Compound assignment operator

long x = 10;
int y = 5;
y *= x; // also written as y = y*x

## Ternary Operators
conditional operator: ? : , otherwise known as the ternary operator, is the only operator
that takes three operands and is of the form: booleanExpression ? expression1 : expression2
-The first operand must be a boolean expression 
-And the second and third can be any expression that returns a value

## Switch statement
The switch statement evaluates on a variable. As of now it can take  
■byte and Byte
■short and Short
■char and Character
■int and Integer
■String
■enum values
Boolean and Long Not directly supported

-Break Statements terminate the switch statement and return flow
control to the enclosing statement
-The default case can be anywhere and it can still not be defined. If code doesn't see a value to to switch to  it jumps to default if available
and if not it does nothing in the switch statement
-Without the break statement the switch flow will  run through each case untill the last case then stop
-The data type for case statements must all match the data type of the switch variable (if switch is taking in a variable of type string, then the case statement should also return a string)

## While 
The while control structure takes in a boolean expression.
The loop continues till it sees that a condition evaluates to false
It is similar to an if-then statement
  -DO WHILE
   Similar to while but guarantes a statement block will be executed atleast once before condition check
   Same way it can run without {}, just put your identation right
NOTE :
      java recommends you use a while loop when a loop might not be executed at all and a do-
      while loop when the loop is executed at least once.

## Basic for statement
-Format : for(initialization; booleanExpression; updateStatement){}
-The initialization and update sections may contain multiple statements, separated by commas.
-for( ; ; ){} this creates an infinite loop and also doin this ( ;i < 10 ; i++) is correct. Without the initialization it can still work

## For each statement
-Format : for(datatype instance : collection)
-The right-hand side of the for-each loop statement must be a built-in Java array or an object whose class implements java.lang.Iterable, which includes most of the Java Collections framework.
-The collection type must match the instance type 
-When you see a for-each loop on the exam, make sure the right-hand side is an array or Iterable object and the left-hand side has a matching type
-
