//Delegates
//how to change delegates and why you'd want to.


def writer = {
    append 'Gino'
    append ' lives in Chicago'
}

//writer() // if called with no append defined in this clas MissingMethodException
//def append(String s){
//    println "append() called with argument of $s"
//}
//
//What if append() lives in another class, that we want to delegate responsability to


//e.g. StringBuffer includes append()

StringBuffer sb = new StringBuffer()
// here's the delegate for this closure
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb

writer()

//If we have our append method in this class, is going to be called even if we have set the delegate
// That is the resolution strategy