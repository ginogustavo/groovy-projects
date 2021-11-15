import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode

@CompileStatic
class SomeClass{

    String foo(){
        "Foo"
    }

    String bar(){
        "Bar"
    }

    @CompileStatic(TypeCheckingMode.SKIP)
    void noReturn(){

    }

}
