@groovy.transform.ToString()
class User {
    Long id
    String firstName
    String lastName
    String email
    Date dob
    void printFullName(){
        println "Fullname: $firstName $lastName"
    }
}
/*
By default:
Import common packages
Classes and methods are public
Properties are private
Last sentences is returning no keyword return
No semicolon
No getter and setters
No constructors, we can initialize it using named parameters
System.out.println is native now is just println, can omit the parenthesis and include as parameters
Get rid of @overwrite toString and use (AST Transformation): @groovy.transform.toString() annotation (meta programming)
*/