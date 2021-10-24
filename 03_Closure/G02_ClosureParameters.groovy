//Implicit parameter
def foo = {
    println it
}
foo("Gino")
def noparams = {->
    println "no params"
}
noparams()
//noparams("test") // will throw exception

def sayHello = {String first, String last ->
    println "Hello, $first, $last"
}
sayHello("Gino", "Ureta")

//default values
def greet = {String name, String greet = "Howdy" ->
    println "$greeting, $name"
}
greet("Gino", "Hi There")
greet("Gustavo")

//var-args
def concat = {String ... args ->
    args.join('')
}
println concat('abc', 'def', '123')
println concat('abc', 'def', '123', 'ghi', '456')


def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.paramterTypes
}
def someClosure = {int x , int y -> x+y}
//someMethod( someClosure )
println someClosure.maximumNumberOfParameters
println someClosure.parameterTypes
