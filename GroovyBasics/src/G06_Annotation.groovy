//Annotation & AST Transformation
//==============================

//Spring MVC Controller

//@Controller(name="MyHomeController")
class HomeController{

    String home(){
    
    }
}
/*
Unlike Java, in Groovy, an annotation can 
be used to alter the semantics of a language => AST Transformations

We used one example, a method to override the toString method 
by replacing with a single line above the class

toString AST transformation 

Inmutable AST Transformations
https://docs.groovy-lang.org/next/html/gapi/index.html

What is a immutable class in java?
It's a class that follows a set of specifications (rules)
*/



