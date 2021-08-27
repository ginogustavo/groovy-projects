// 1 is not a primitive type, is an instance of java.lang.Integer
1.getClass().getName() 

1234567890123.getClass().getName() // Long
11223344551234567890123.getClass().getName() // java.math.BigInteger

int x = 1
x.class  // Still integer, despite of we declared a primitive
    // Groovy wants to deal with all the wrapper classes
    
    
def y = 2
y.class    // same

5.5.class // java.math.BigDecimal

5.5d.class // Double




