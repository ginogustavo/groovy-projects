//Working with String in Groovy

// Java
char c = 'c'
println c.class // java.lang.Character

String str = 'this is a string'
println str.class  // java.lang.String


//Groovy
def c2 = 'c'
println c2.class // java.lang.String

def str2 = 'another string'
println str2.class // java.lang.String

//String interpolation
String name = "Gino"
String msg = "Hello " + name +"."    // Java
println msg

String msg2 = "Hello ${name}." // It'll try to evaluate that function in runtime
println msg2

String msg3 = 'Hello ${name}.'  // uses simple string
println msg3

String msg4 = "we can evaluate expression here: ${1+1}"
println msg4

//multiline strings
def aLargStr = '''
This is a 
large multiline
message
'''
println aLargStr

def aLargStr2 = """
This is a 
large multiline
message ${3+2}
"""
println aLargStr2

// dollar slashy

def folder = $/C:\groovy\gino\documents/$
// anything inside is a string and we don't have to escapte it.
println folder