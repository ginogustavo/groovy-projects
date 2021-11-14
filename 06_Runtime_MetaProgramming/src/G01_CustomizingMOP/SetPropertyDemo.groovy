package G01_CustomizingMOP
//setProperty is a method that is in the Interface Groovy Object.
//You can intercept write access to properties by overriding the setProperty() method.

class POGO{
    String property
    void setProperty(String name, Object value){
        this.@"$name" = 'overridden'
    }
}

def pogo = new POGO()
pogo.property = 'a' // my method is overriding this assigment.

assert pogo.property == 'overridden'
