/**
 * Groovy supports the concept of methodMissing.
 * This differs from invokedMethod in that it is only invoked in case of a failed method dispatch,
 * when no method can be found for the given name and/or the given arguments:
 */

class MyEmployee{
    def methodMissing(String name, def args){
        if(name!= 'someMethod'){
            throw new MissingMethodException(name, args)
        }
        println "Method missing called on $name"
        println "with arguments ${args}"
    }
}

MyEmployee emp = new MyEmployee();
emp.something(1,2,3)
emp.someOtherMethod(4,5,6)
