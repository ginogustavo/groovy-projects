import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode(excludes = ["email"])
class Employee{
    String first
    String last
    String email


//    boolean equals(o) {
//        if (this.is(o)) return true
//        if (getClass() != o.class) return false
//
//        Employee employee = (Employee) o
//
//        if (email != employee.email) return false
//        if (first != employee.first) return false
//        if (last != employee.last) return false
//
//        return true
//    }
//
//    int hashCode() {
//        int result
//        result = (first != null ? first.hashCode() : 0)
//        result = 31 * result + (last != null ? last.hashCode() : 0)
//        result = 31 * result + (email != null ? email.hashCode() : 0)
//        return result
//    }
}

Employee emp1 = new Employee(first: "Gino", last:"Ureta", email:"gino@ureta.com")
Employee emp2 = new Employee(first: "Gino", last:"Ureta", email:"gino@uretwork.com")

assert emp1 == emp2
