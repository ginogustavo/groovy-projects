import groovy.transform.ToString
import groovy.transform.builder.Builder

//Builders can help write classes that can be created using fluent api calls
// A new way of construct objects (it can help out when creating objects of objects)
// If you need Java integration or some improved cases of type safety, the @Builder transform might prove useful.
//http://docs.groovy-lang.org/2.4.8/html/gapi/groovy/transform/builder/Builder.html

@Builder //Another easy way to instantiate an object
@ToString (includeNames = true)
class Engineer{
    String firstName
    String lastName
    String middleInitial
    String email
    Date hireDate
    List languages
}


Engineer e = Engineer
    .builder() //after it we can call setter for our building
    .firstName("Gino")
    .lastName("Ureta")
    .middleInitial("G")
    .email("gino@ureta.com")
    .hireDate(new Date())
    .languages(["Java", "Groovy"])
    .build()  // When done with properties, we call the build()

println e
assert e.firstName == "Gino"
assert e.lastName == "Ureta"
assert e.languages.size() == 2