package edu.prahlad.patterns.factory.person;

public class PersonFactory {
    public static Person getPerson(String personType){
        Person person = null;

        if(personType == "male"){
            person = new Male();
        }else if(personType == "female"){
            person = new Male();
        }
        return person;
    }
}
