package G05_Assigment

class Student{
    String first
    String last
    String email
    List languages

    def invokeMethod(String name, Object args){
        println "InvokeMEthod() called with args $args"
    }

    def getProperty(String property){
        println "getProperty called.. "
        metaClass.getProperty(this,property)
    }

    void setProperty(String property, Object newValue){
        println "setProperty() called with name $property and new value $newValue"
        metaClass.setProperty(this, property, newValue)
    }
}


Student st = new Student()
st.writeCode("Groovy")
println st.first
st.languages = ["Java", "Groovy"]

Expando exp = new Expando()
exp.invoiceid= 456
exp.printInvoice = {-> println "Invoice details from #$invoiceid"}
exp.printInvoice()

@groovy.transform.ToString(includeNames = true)
class Person{
    String first, last
}

Person p = new Person(first: "Gino", last: "Ureta")
p.metaClass.email = "gino@ureta.com"
println p
println p.email


Integer.metaClass.timesTwo = {delegate * 2}

println 2.timesTwo()
println 4.timesTwo()
println 10.timesTwo()

//another is to create a Category
class IntegerCategory{
    def value

    def timesTwo(){
        return value * 2
    }

}

