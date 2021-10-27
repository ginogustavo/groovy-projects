def myMethod(Closure c){
    println "doing some actions with"
    println c(5,4)
}

def clo1 = {
    println "within closure"
}
def clo2 = { num1, num2 ->
    return num1 + num2
}
myMethod(clo2)


def myList = [7,5,3]
myList.each{println "my num is $it"}

def myMap = [first: "Gino", last:"Ureta"]
myMap.each{
    println it
    println it.key + it.value
}

// Example of Curry

def saveCheckIn = {Date checkInDate, String room, String person ->
    println "On $checkInDate, $person stayed on $room"
}

def saveTodayCheckIn =saveCheckIn.curry(new Date())

saveCheckIn(new Date(), "101", "Juan")
saveCheckIn(new Date()-4, "103", "Maria")

saveTodayCheckIn("403", "Julio")

def checkInAtPRoom= saveCheckIn.ncurry(1,"Pressidential Room")
checkInAtPRoom(new Date(), "Juan")


def checkOwner= saveCheckIn.rcurry("Mrs. Barrios")
checkOwner(new Date()-3, "505")

//find() & findAll()
//---------------------
def somenumbers = [10,15,20,25,30,35,40,45,50,55]
println somenumbers

// find() return the first match
def findNumbers = somenumbers.find{
    it>30
}
println findNumbers

// findAll() return All matches
def findAllNumbers = somenumbers.findAll{
    it > 30
}
println findAllNumbers


//any() & every()

//any() Iterates and check if a predicate is valid for at least one element
def isTereMore49 = somenumbers.any{it>49}
println isTereMore49

println somenumbers.any{it>60}

//every() determines if the given predicate is valid for all items
println somenumbers.every{it%2==0} // are even
println somenumbers.every{it%5==0} // are multiple of 5

//groupBy() sort by groups determined by the supplied mapping closure
// The closure should return the key that this item should be grouped b
// The returned LinkedHashMap will have an entry for each distinct key returned from the closure,
//  with each value being a list of items for that group.

def nu = [1,2,3,4,5,6]
println nu.groupBy{it%2}

println somenumbers.groupBy{it%10}
//group by decimal
println somenumbers.groupBy{it.toString()[0]}

List people = [
        [name: 'Jane', city: 'New York City'],
        [name: 'John', city: 'Cleveland'],
        [name: 'Mary', city: 'New York City'],
        [name: 'Dan', city: 'Cleveland'],
        [name: 'Tom', city: 'New York City'],
        [name: 'Frank', city: 'New York City'],
        [name: 'Jason', city: 'Cleveland']
]

println people.find{ person-> person.city == 'Cleveland'}
println people.findAll{ person-> person.city == 'Cleveland'}


println people.groupBy{ person-> person.city == 'Cleveland'} //true or false of its in cleveland
println people.groupBy{ person-> person.city}  // by city


def peopleByCity = people.groupBy{ person-> person.city}
def newYorkers = peopleByCity["New York City"]
println newYorkers


def clevelanders = peopleByCity.Cleveland
clevelanders.each{
    println it.name
}
