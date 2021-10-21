//https://docs.groovy-lang.org/latest/html/gapi/groovy/lang/Range.html

Range r = 1..10
println r
println r.class.name
println r.from
println r.to

r.each{
    print it
}

println "\n------------"

Range r2 = 1..<10 // includes everything less than 10 1-9
//println r2

// as inherited from an interface(List) contains other methods
assert (0..10).contains(1)
assert (0..10).contains(10)
assert (0..10).contains(-1) == false
assert (0..10).contains(11) == false

assert(0..<10).contains(0)
assert(0..<10).contains(10)==false

//Not only for numbers

// Range of dates
Date today = new Date()
Date oneWeekAway = today +7 // GDK makes this simplier

println today
println oneWeekAway

Range days = today..oneWeekAway
println days

println "\n------------"
days.each{
    print it
}

println "\n------------"

//Ranges of Strings
Range letters = 'a'..'z'
println letters
letters.each{
    print it
}

// can be with objects