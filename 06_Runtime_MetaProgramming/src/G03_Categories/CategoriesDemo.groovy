package G03_Categories

//String.metaClass.shout = {-> toUpperCase() }
//println "Hello, World!".shout()

//will work only in the use context
use(StringCategory){
   println "Hello, World!".shout()
}
//This wont work, because shout was not part of String only the Category(StringCategory)
//println "Hello World 2 !".shout()




