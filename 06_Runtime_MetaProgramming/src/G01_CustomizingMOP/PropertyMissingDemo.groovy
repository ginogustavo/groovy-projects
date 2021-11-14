package G01_CustomizingMOP

class Foo{
    def propertyMissing(String name){
        "caught missing property: $name"
    }

}

println new Foo().bar
