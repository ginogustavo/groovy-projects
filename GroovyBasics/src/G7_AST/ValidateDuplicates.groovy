class Location{
    String displayName
    String code
    String toString(){
    println "$code $displayName"
    }
}

Location l1 = new Location(displayName:"us",code:"1")
Location l2 = new Location(displayName:"us",code:"2")
Location l3 = new Location(displayName:"us",code:"3")
Location l4 = new Location(displayName:"us",code:"4")
Location l5 = new Location(displayName:"us",code:"5")
Location l6 = new Location(displayName:"us",code:"6")

def mydata = []
mydata.add(l1)
mydata.add(l2)
mydata.add(l3)
mydata.add(l4)
mydata.add(l5)
mydata.add(l6)


def nonUnique = { list -> 
    list.findAll{ a-> list.findAll{b->b.code==a.code}.size() > 1}.unique()
}
int val = nonUnique(mydata).size()
assert val == 0 



