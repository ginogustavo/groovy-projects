//In Groovy, Curry refers to the concept of partial application. They let you set the value
// of one parameter of closure and will return a new closure accepting one last parameter.
//See Closure API documentation for methods.

def log = {String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "This is my first debug statement")

// we dont need to repeat above on every new log

//Take the original closure, and call the method curry of it. by just passing one parameter
def  debugLog = log.curry("DEBUG") // this argument is passed to our existing closure

// it returns a new closure, with only 2 arguments needed to fill (date & message)

debugLog(new Date(), "This is another debug stg")
debugLog(new Date(), "yet another")


def todayDebugLog = log.curry("DEBUG", new Date()) // we could take the debugLog
todayDebugLog("This is today's debug msg")

//Curry method allows us to create new closures based off of that one and take less arguments



// Right Curry
def crazyPersonLog = log.rcurry("Why I am logging this way") // is replacing from right to the left
crazyPersonLog("ERROR", new Date())

//index based currying

def typeMsgLog = log.ncurry(1, new Date()) // indicating index of our param list
typeMsgLog("ERROR", "This is using ncurry")

