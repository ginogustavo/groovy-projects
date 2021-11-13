/**
 * JavaBean is a standard
 * -All properties private (getter/setter)
 * -A public no-argument constructor
 * -implements serializable (to represetn object as bytes with the object data)
 *
  */
EmployeeBean emp  = new EmployeeBean(first: "Gino", last:"Ureta", email:"gino@ureta.me")
println emp

Employee emp2 = new Employee()
emp2.first = "Gustavo"
emp2.last = "Barrios"
println emp2.first
println emp2.fullName


// direct access with @
DoubleBean db = new DoubleBean()
db.value = 100

println db.value  // value as we call getter
println db.@value  // real value

