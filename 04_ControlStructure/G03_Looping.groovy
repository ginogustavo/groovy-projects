//while
List numbers = [1,2,3]
while(numbers){
    //do something
    numbers.remove(0)
}
assert numbers == []


//for
//for(variable in iterable){}
List numbers2 = [1,2,3]
for (i in numbers2){
    println i
}

for (Integer i in 10..15){
    println i
}

// return / break / continue

String getFoo(){
    "foo" //last line is returning, keyword is unneeded
}

Integer a = 1
while(true){
    a++
    break
}

assert a==2


for (String s in 'a'..'z'){
    if(s == 'a') continue     //Do not continue in this block, continue on in this Loop
    println s                //1st iteration, this never gets called
    if(s > 'b') break

}

//no do while, you can use closure,