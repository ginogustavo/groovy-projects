enum Days{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY}

def days =  Days.MONDAY..Days.SUNDAY
println days.size()
println days.contains(Days.WEDNESDAY)
println days.from
println days.to

//for in loop
for(x in days){
    println x
}

//using closures
days.each{ day ->
    println day
}

def dayList = ["Sun","Mon","Tue","Wed","Thu","Fri","Sat"]
println dayList
println dayList.size()
dayList.remove("Sat") // or simply dayList.pop()
println dayList
//dayList.push("Sat")
//dayList[6] = "Sat"
dayList << 'Sat'
println dayList
println dayList.get(3)  // or dayList[3]

def daysMap = [1:"Sunday", 2:"Monday" ,3:"Tuesday" ,4:"Wednesda" ,5:"Thursday" ,6:"Friday" ,7:"Friday"]
println daysMap
println daysMap.getClass().getName()
println daysMap.size()

daysMap.values()