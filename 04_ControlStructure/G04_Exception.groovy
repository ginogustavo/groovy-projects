//exceptions

//In Groovy, every exception is option(also for checked exception)
//They do not to be part of the method signature

//public void foo() throws Exception{
//    throw new Exception()
//}

def foo(){
    throw new Exception("Foo Exception")
}

List log = []

try{
    foo()
}catch(Exception e){
    log << e.message
}finally{
    log << 'finally'
}

println log


//Java7 introduces multi catch syntax
try{
    //do stuff
}catch(FileNotFoundException | NullPointerException e){
    println e.class.name
    println e.message
}