package G02_MetaClass
Expando e = new Expando()
e.name = 'Gino'
e.writeCode = {-> println "$name loves to code..."}
e.writeCode()

//it is for instances ^^

//Expando e2 = new Expando()
//e2.writeCode() // it wont work

// MetaClass is really an Expando
class Developer{
}
// per instance
Developer gino = new Developer()
gino.metaClass.name = "Gino"  // Developer is not Expando, we have to added to the metaclass associated.
gino.metaClass.writeCode = {-> println "$name loves to write code ... "}
gino.writeCode()

//every instance. careful!
String.metaClass.shout = {-> toUpperCase()}
println "Hi Gustavo!".shout()
