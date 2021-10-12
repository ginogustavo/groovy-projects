// Arithmetic Operators
assert 10 + 1 == 11
assert 10 - 1 == 9
assert 10 * 2 == 20
assert 10 / 5 == 2
assert 10 + 1 == 11
assert 10 % 3 == 1
assert 10 **2 ==100

// The above ones are also available in assignment form:
// +=  -=  *=  /=  **=
def a = 5
a+=20  //  a = a + 20
assert a == 25

//Relational Operators
assert 1+2 == 3
assert 3!=4
assert -2  < 2
assert 4> 2
assert 3 <= 3

// Logical Operators
assert !false
assert true && true
assert true || false

//Conditional Operators

    // Ternary Operator
    String s = ""
    if(s!= null && s.length()>0){
        result = 'Found'
    }else{
        result = 'Not found'
    }
    String s2 = ""
    result2 = (s!= null && s.length()>0)?'Found':'Not found'

    //Elvis operator

    class User3{
        String name
    }
    User3 user3 = new User3()
    //user3.name = 'admin'

    displayName = user3.name? user3.name:'Anonymous'
    displayName = user3.name?:'Anonymous'

//Object Operators

    //Safe Navigation Operator
    //Java
    class Person3{
        String address
    }
    Person3 p = new Person3()
    if(p.address!=null){
        p.address = "1234 Main"
        println p.address
    }

    //Groovy

    def address = p?.address
    //It won't throw NullPointerException if the address object is null.
    // instead it'll set address to null, so we know is null when we do something.
    assert address == null

//more
println "http://groovy-lang.org/operators.html"