//create new date

Date today = new Date()
println today
println "--------------"

Date bday = new Date('08/21/1989')
println bday
println bday.format("M-d-Y")
println "--------------"


Date oneWeekFromToday = today.plus(7)
Date oneWeekFromToday2 = today + 7  //same (overloaded)

Date oneWeekAgo = today.minus(7)
Date oneWeekAgo2 = today -7

println oneWeekFromToday
println oneWeekAgo

println "--------------"

oneWeekFromToday.downto(today){
    println it
}
println "--------------"

//ranges of dates
Range twoWeeks = oneWeekAgo..oneWeekFromToday
twoWeeks.each{
    println it
}

println "--------------"

//next and previous
Date newyear = new Date('01/01/2019')
println newyear.next()
println newyear.previous()

println "--------------"

Date rightNow = new Date()
println  rightNow.toTimestamp() // for database. sql
