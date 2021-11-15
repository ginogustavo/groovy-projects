import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributes = true
builder.omitNullAttributes = true
builder.sports{
    sport(id:1){
        name: 'Baseball'
    }
    sport(id:2){
        name: 'Soccer'
    }
    sport(id:3){
        name: 'Football'
    }
    sport(id:4){
        name: 'Hockey'
    }
//    sport(id:null){
//        name: ''
//    }
    sport(id:null, foo:''){  // wont be part because initial config.
        name: ''
    }

}

//https://github.com/apache/groovy/blob/master/subprojects/groovy-xml/src/test/groovy/groovy/xml/MarkupBuilderTest.groovy