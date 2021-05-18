package edu.prahlad.patterns.factory.person;

public class PersonImp {
    public Person grantPersonWish(String personType, String msg){
        Person person = PersonFactory.getPerson(personType);
        person.wish(msg);
        return person;
    }
}
