package G04_Intercept_Cache_Invoke

class Developer{

    List languages = []

    def methodMissing(String name, args){
        println "$name() method was called"

        if (name.startsWith("write")){
            String language = name.split("write")[1]
            if(language.contains(language)){
                def impl = {Object[] theArgs ->
                    println "I like to write code in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }

}

Developer gino = new Developer()
gino.languages << "Java"
gino.languages << "Groovy"
    println gino.metaClass.methods.size()
gino.writeGroovy()
gino.writeGroovy()
gino.writeGroovy()
    println gino.metaClass.methods.size()
gino.writeJava()
gino.writeJava()
    println gino.metaClass.methods.size()

