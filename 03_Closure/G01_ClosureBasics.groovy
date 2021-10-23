//Closure are objects as contrary to just methods, they can be passed around
def c = {}

println c.class.name
println c instanceof Closure

def sayHello = {
    println "Hello"
}
sayHello()


def sayHelloName = { name ->
    println "Hello $name"
}
sayHelloName('Gino')

def one = 1
def closureOne = { one }
assert closureOne() == 1

//each method
List nums = [1,3,5,2,6,8]
//By default, if there are no arguments passed into a closure,
//there's a special reserfverd keyword caled it
nums.each({
    println it
})

//we can give it a nanme e.g. "num" (to indicate it'a an argument use ->
nums.each({ num->
    println num * 0.1 // optional operations
})


//closures are object & last param
def timesTen( num, myClosure ){
    myClosure(num * 10)
}
def timesTwenty(num, closure2){
    closure2(num*20)
}
timesTen(11, {println it})
timesTwenty(4, {println it}) // the closure can be a variable e.g   def clo = {println it} and send clo

/*********
 Any method that accepts closure as the last argument
 has a special idiomatic way to use it in an expresssion
 *********/
timesTen(3){println it}   // You can move the closure out side the parenthisis

//you will see as
timesTen(5){
    println it
}

//or
nums.each{ num->
    println num
}


//Integer class' "times" method takes a closure: It executes the closure this many times starting from zero.
10.times({})  // or since it's last method, get rit of parenthesis
10.times{
    print it
}
println "\n-----"

import java.util.Random

Random rand = new Random()
3.times{
    println rand.nextInt()
}
// printing a random number 3 diff times