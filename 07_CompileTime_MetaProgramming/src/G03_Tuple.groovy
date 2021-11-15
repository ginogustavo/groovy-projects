import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
//in the order they declared
class Worker{
    String first
    String last
    String email
}

//in the order they declared
Worker w = new Worker("Gustavo", "Ureta", "gustavo@work.com")
println w.toString()