package training

String tec1 = "c  "
String tec2 = "c "
String tec3 = "c#"
String tec4 = "java"

String param = tec3

if(param.toLowerCase().startsWith('c')  && ((param =~ / /).count)>=1 ){
    param = param.replace(' ','+')    
}

println '--'+param+'--'

//
//println ((tec1 =~ / /).count)
//println ((tec2 =~ / /).count)
//
//
//if start with c
//and has 1 or 2 spaces
//
//then replace spaces by +`
//
//


def a = ["abc", "def"].toList()
println a[1]