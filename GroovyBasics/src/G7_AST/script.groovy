
//testing out our customer class
def d = new Date()
def c1 = new Customer(first:"Tom", last:"Jones", age:21, since:d, favItems:['Books','Games'])
def c2 = new Customer("Tom","Jones",21, d, ['Books','Games'])
assert c1 == c2

//if we try to change c1
c1.first = "Dan" // Exception becauseof the immutable
