/*
Closures is not just a lambda expression that support functional programming
Feature: Changing Closure Delegate.
Scopes:
-this: corresponds to enclosing class where the closure was defined, even for scripts(implicit class)
-owner: corresponds to enclosing object where the closure is defined (a class or closure)
-delegate: corresponds to a third party object where methods calls or properties are resolved whenever
   the receiver of the message is not defined.
*/

class ScopeDemo{

    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name  // most of the time the delegate is going to be the owner as well. (unless you changed)

        def nestedClosure = {  // inner closure
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }

        nestedClosure()
    }
}

def demo = new ScopeDemo()
demo.outerClosure()
/*
ScopeDemo
ScopeDemo
ScopeDemo
ScopeDemo
ScopeDemo$_closure1
ScopeDemo$_closure1
*/