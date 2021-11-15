import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

// println 'http://groovy-lang.org'.toURL().text
// httpbuilder a client for rest call

//Grab let us use http builder dependency
@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')
String base = 'http://api.icndb.com'

def chuck = new RESTClient(base)
chuck.contentType = ContentType.JSON

chuck.get( path: '/jokes/random'){ response, json ->
    println response.status
    println json
}

def params = [firstName:"Gino", lastName: "Ureta"]
chuck.get( path: '/jokes/random', query: params){ response, json ->
    println response.status
    println json
}