import groovy.transform.AutoClone

@AutoClone
class Tester{
    String first
    String last
    List favItems
    Date since
}

def t = new Tester(first:"Naty", last:"Quino", favItems: ['ipod', 'exer'] , since: new Date())
def t2 = t.clone()

assert t instanceof Cloneable
assert t.favItems instanceof Cloneable
assert t.since instanceof Cloneable
assert !(t.first instanceof Cloneable)

assert !t.is(t2)
assert !t.favItems.is(t2.favItems)
assert !t.since.is(t2.since)
assert t.first.is(t2.first)