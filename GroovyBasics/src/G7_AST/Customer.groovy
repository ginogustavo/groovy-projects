import groovy.transform.Immutable

@Immutable
class Customer2{
    String first, last
    int age
    Date since
    Collection favItems
}