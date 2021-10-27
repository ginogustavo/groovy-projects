package service

import domain.Person

class PersonService implements IPersonService{
    @Override
    Person find() {
        Person p = new Person(first: "Gino", last: "Ureta")
        return p
    }

    @Override
    List<Person> findAll() {
        Person p1 = new Person(first: "Gino", last: "Ureta")
        Person p2 = new Person(first: "Gustavo", last: "Barrios")
        [p1,p2]
    }
}
