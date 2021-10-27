package service

import domain.Person

interface IPersonService {

    Person find()

    List<Person> findAll()
}