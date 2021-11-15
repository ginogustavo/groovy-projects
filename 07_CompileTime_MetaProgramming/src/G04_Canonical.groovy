import groovy.transform.Canonical

//A combination of the previous 3 annotations ToString, Tuple and Equal And hashcode

@Canonical
class Client{
    String first
    String last
    String email
}


Client c1 = new Client("Gino", "Ureta", "gino@ureta.com")
Client c2 = new Client("Gino", "Ureta", "gino@ureta.com")

assert c1 == c2
c1.toString()
