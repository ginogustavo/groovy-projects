//Provided the assertion an expression that evaluates TRUE, do not print anything.
assert true

//Full expression on the right hand side
assert 1==1

//Evaluating an expression
def x = 1
assert x == 1

//When failed it print out the Exception
assert false

// The output shows evaluation results from the outer to the inner expression
assert 1 == 2

//Complex debug output
assert 1 == (3+10) * 1000

//The assertion statements true power unleashes in complex Boolean statements,
//or statements with collections or other toString-enabled classes:
def y = [1,2,3,4,5]
assert (y<<6) == [6,7,8,9,10]