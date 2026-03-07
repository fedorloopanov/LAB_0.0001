package org.example;

import java.util.List;

public class PeopleWrapper {
    private List<Person> people;

    public PeopleWrapper() {
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}