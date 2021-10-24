//each & eachWithIndex
List favNums = [2,21,44,35,8,4]

for(num in favNums){
    println num
}

favNums.each { println it}

for (int i = 0;i<favNums.size();i++){
    println "[$i]:${favNums[i]}"
}

favNums.eachWithIndex{num, idx ->
    println "$idx-${num}"
}

//findAll
List days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
List weekend = days.findAll{
    it.startsWith("S")
}
println days
println weekend

//Collect
List nums = [1,2,2,7,2,8,2,4,6]
// want to create a new list of doubles

List doubles = []
nums.each{num->
    doubles << num*2
}

println nums
println doubles // may be effective bc we are using another list

//Collect: Takes a closure, it will be responsible for action of collecting and manipulating
List newDoubles  = nums.collect{ num->
    num*2
}
println newDoubles // more concise way
