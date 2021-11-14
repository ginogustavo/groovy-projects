@groovy.transform.ToString
class Person{
    String first, last
    //constructors...
    //You don't need to create constructors, those are created with existing variables.

    Person(String fulllName){
        List parts = fullName.split(' ')
        first = parts[0]
        last = parts[1]
    }

    public void foo(String a, String b){
        //do stuff
    }

    String getFullName(){
        "$first $last"
    }

    def bar(){
    }

    static String doGoodJob(){
    }

    List someMethod(List numbers = [1,2,3], Boolean canAccessAll = false){

    }

    def concat(String... args){
        println args.length
    }
}

//Person p = new Person(first:'Gino', last: 'Ureta')
//println p
println " "

//Person p2 = new Person(fullName:'Gustavo Barrios')
//println p2

Person pe = new Person("Gino Ureta")
pe.concat("a", "b")
pe.concat("a", "b", "c", "d")
