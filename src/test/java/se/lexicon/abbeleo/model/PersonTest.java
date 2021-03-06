package se.lexicon.abbeleo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void createPerson() {
        //Arrange
        Person newPerson;

        String expectedFirstName = "Leo";
        String expectedLastName = "de Alcantara";
        //Act

        newPerson = new Person("Leo", "de Alcantara");

        //Assert
        assertEquals(expectedFirstName, newPerson.getFirstName());
        assertEquals(expectedLastName, newPerson.getLastName());

    }
}