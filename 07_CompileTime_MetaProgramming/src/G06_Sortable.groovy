import groovy.transform.Canonical
import groovy.transform.Sortable

//To use Sortable
//implement Comparable interface
//to have compareTo method

@Canonical
@Sortable(includes = ['name','name' ] ) // only if first is equal, then check the second
class Bank{
    String name
    String address
}

Bank b1 = new Bank("Bank of America")
Bank b2 = new Bank("CitiBank")
Bank b3 = new Bank("Chase")
Bank b4 = new Bank("JP Morgan")

def banks = [b1,b2,b3,b4]
println banks.toSorted()

