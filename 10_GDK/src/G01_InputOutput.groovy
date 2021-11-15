println "Enter your fav spot team:"
String team

System.in.withReader {reader->
    team = reader.readLine()
}

println "your fav team is $team"
