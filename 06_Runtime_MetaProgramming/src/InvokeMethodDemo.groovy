class InvokeDemo {

    //The method is called when the one you called is not present on a Groovy Object
    def invokeMethod(String name, Object args){
        return "called invokeMethod with $name $args"
    }

    def test(){
        return "method exists"
    }
}
def invokeDemo = new InvokeDemo();
assert invokeDemo.test() == "method exists"
assert invokeDemo.otherMethod() == "called invokeMethod with otherMethod []"