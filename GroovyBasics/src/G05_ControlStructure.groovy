//if
if(true)
    println "value is true"

//false | null | empty strings | empy collection
if (!false)
    println "value is false "
    
String name = null
if(name)
    println "name has a value"

//Object obj  // if evaluated-> false
//Object obj = null // if evaluated-> false
Object obj = new Object() // if evaluated-> true
if(obj)
    println "object printed"    

//List mylist  //will evaluate as false
//List mylist = null // will evaluate as false
List mylist = new ArrayList(); // if empyt-> false
mylist.add(1) // then is true
if(mylist)
    println "List created"
    
    
String last = ""  //evaluate as false
if(last)
    println "Last is not empty"

//if-else
def x = 5
if(x == 10){
    println "x is 10"
}else{
    println "x is not 10"
}
//classic while
def i = 1
while(i<=10){
    println i
    i++
}

//for in list
def list = [1,2,3,4]
for(num in list){
    println num
}

//closure
def list2 = [1,2,3,4]
list2.each {println it}

//switch
def myNumber = 1
//if(myNumber ==1 ) {
//    println "My Number is 1"
//}else if ...

switch(myNumber){
    case 1:
        println "number is 1"
        break
    default:
        println "We hit the default case"
        
}


