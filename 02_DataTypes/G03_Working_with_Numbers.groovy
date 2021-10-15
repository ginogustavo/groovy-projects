//Groovy with Numbers
//------------------------
def number =10
println number.class

def decimal = 5.50
println decimal.class

//Converting data types
//-----------------------------

//Explicit
def myFloat = 1.0

//Implicit

// Rules for +,-,*

// If either operand is a float or a double the result is a double
// In Java, if only floats are involved the result is a float
Float f = 5.25
Double d = 10.50
def result = d/f
println result
println result.class

// If either operand is a Big decimal
def x = 34.5 // BigDecimal
def y = 15
def bigResult = x/y
println bigResult
println bigResult.class


// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a Long
// If either operand is a Integer the result is an Integer

// Double division
println 5.0d - 4.1d
println 5-4.1

// Integer Division

def intDiv = 1/2
println intDiv // differnt from Java where we get 0
println intDiv.getClass().getName()


//GDK Methods
//-------------

assert 2 == 2.5.toInteger() // conversion
assert 2 == 2.5 as Integer // enforced coercion
assert 2 == (int) 2.5 // cast

assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

// times | upto| downto | step

20.times{
    print "*"
}

1.upto(10){num->
    println num
}
10.downto(1){num->
    println num
}
0.step(1,0.1){num->
    println num
}