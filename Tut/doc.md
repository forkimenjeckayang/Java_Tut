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
conditional operator: /*? :*/ , otherwise known as the ternary operator, is the only operator
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
