def map = [:] //  [] -> list      [:] -> map
println map
println map.getClass().getName() //java.util.LinkedHashMap

def person = [first: "Gino", last:"Ureta", email:"gino@ureta.com"]
println person
println person.first

//Adding
person.twitter = "@ginoureta"
println person

//Key DataTypes
def twitter1 = [username:"@ginou", email:"gino@ureta.com"] // we dont have to put keys in quotes bc by default it's string.
def twitter2 = [username:"@ginou", "Email address":"gino@ureta.com"] // if 2 words need quotes

//How to use variables as key
def emailKey = "EmailAddress"
def twitter3 = [username:"@ginou", emailKey:"gino@ureta.com"] // emailKey:gino@ureta.com]
def twitter4 = [username:"@ginou", (emailKey):"gino@ureta.com"] //if we need to evalute add parenthesis: EmailAddress:gino@ureta.com]


println person.size()
println person.sort() //values have no sort in a Map, sort is for key. [email:gino@ureta.com, first:Gino, last:Ureta, twitter:@ginoureta]

//looping
for(entry in person){
    println entry
}
//first=Gino
//last=Ureta
//email=gino@ureta.com
//twitter=@ginoureta

for(key in person.keySet() ){
    println "$key:${person[key]}"
}
//first:Gino
//last:Ureta
//email:gino@ureta.com
//twitter:@ginoureta


//each | eachWithIndex
