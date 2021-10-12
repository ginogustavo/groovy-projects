// create a new instance of a developer 
Developer d  = new Developer()
d.first = "Gino" // looks like we are accessing the property, but internally calling the setter
d.setLast("Ureta") // calling the actual setter

// assign some languages

//d.languages.getClass().getName()
//d.languages.class


d.languages << "Groovy"    // left shift operator, to add items to the arraylist
d.languages << "Java"


// call some methods
d.work()