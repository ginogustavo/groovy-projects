import groovy.transform.ToString

//@groovy.transform.ToString

@ToString(includeNames = true, excludes = ["email"])
//ignoreNulls, etc
class Person{
    String first
    String last
    String email

//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "first='" + first + '\'' +
//                ", last='" + last + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
}


Person p =new Person(first:"Gino", last:"Ureta", email:"gino@ureta.com")
println p.toString()