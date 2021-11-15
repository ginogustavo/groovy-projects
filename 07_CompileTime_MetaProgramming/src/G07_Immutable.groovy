import groovy.transform.Immutable

@Immutable
class Visitor{
    String first
    String last
    String email
}

Visitor v = new Visitor(first:"Gino", last:"Ureta", email:"gino@ureta.com")
println v.toString()
v.first = "g" // wont work
