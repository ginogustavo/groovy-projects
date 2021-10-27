//Elvis Operator
def data
def msg = data?:'default message' // short for  (data!=null)?data:'default message'
println msg


//Extras of Switch case
def num = 210.toFloat()

switch (num){
    case 1:
        println "1"
        break
    case 2:
        println "2"
        break
    case 1..4:
        println "is in range 1..4"
        break
    case [7,14,21]:
        println "in list [7,14,21]"
        break
    case Integer:
        println "is an integer"
        break
    case Float:
        println "num is a float"
        break
    default:
        println "default "
}

//in
def validAges = 18..35
def someAge = 19
println someAge in validAges