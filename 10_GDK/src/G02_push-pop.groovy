List numbers = []

//push
10.times{
    println "push:\t ${it}"
    numbers << it
}
println numbers

//pop
for(i in 0..9){
    println "pop?\t ${i}"
    numbers.pop()
}
println numbers