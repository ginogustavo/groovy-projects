import groovy.transform.TypeChecked

@TypeChecked // Check error at compile time.
class Freshmen{
    String first
    String last
    String email

    String getFullName(){
        "$first $last"
    }
}