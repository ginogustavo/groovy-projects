def file = new File("dummy.txt")
file.write('This is some text\n')

//new File('dummy.txt').text = '...' // Also available

file.append("More Text000\ntest")

List lines = file.readLines()
lines.each{line->
    println line
}
// List all files

String dir = '.'
new File(dir).eachFile {file2->
    if(file2.isFile()){
        println file2.name
    }
}

//to check directories below, recursively
new File(dir).eachFileRecurse {}

new File('.').eachFile {file3->
    if(file3.name.endsWith('.groovy')){
        println file3.name
    }
}