String dir = '/Users/Gustavo/Downloads'

//List hidden = []
//new File(dir).eachFile {file->
//    if(file.isDirectory()){
//        println file.name
//    }
//
//    if(file.isHidden()){
//        hidden << file
//    }
//}
//println hidden

new File(dir).eachDir {subFolder->
    println subFolder
}

def directory = new File(dir)
println directory.directorySize() // in bytes

//create new
new File('dummy').mkdir()
new File('one/two/three').mkdirs()

new File('dummy').deleteDir()