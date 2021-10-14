//Review of types within Groovy

byte b = 10
b.getClass().getName()

short s = 100
s.class

float f = 1.52F
f.class

3.class // by default instance of Integer (Whatever it needs to be)
// Then, as the need of this data type grows, the datatype will change.

65465465465465443.class // Groovy undestand that it needs be an instance of Long

45665465465465465465465443.class // BigInteger

4.50.class // BigDecimal. Every .decimal in groovy in instance of this.
// It gives us more precision when math operation.


// In Groovy, we can but we have also the option to not declare the type
// def : to indicate there's no type for this declared variable

def x = 10
x.getClass().getName() // Integer

x = "Dan"
x.getClass().getName()  // String


// Recommendation: if we know the type and it's not going to be changed. Type the varible
int y = 10
Integer y2 = 20

// use "def" for cases where you don't care if type changes