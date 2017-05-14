
import java.util.LinkedList;
import java.util.List;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hafsa Umar
 */
public class PeopleListGenerator extends AbstractListModel<String>{
    
    private List<Person> people;

    PeopleListGenerator() {
        Population pop = new Population("Canada");
        people = new LinkedList<Person>();
        for (int i = 0; i < 6; i++) {
            people.add(pop.nextPerson());
        }
    }
    
    @Override
    public int getSize() {
        return people.size();
    }

    @Override
    public String getElementAt(int index) {
        return String.format("First Name: %1$s and Last name: %2$s", people.get(index).getFirstName(),people.get(index).getLastName());
    }
    
     public String getBirthCountry(int index) {
        return people.get(index).birthCountry;
    }

    public String getBirthTown(int index) {
        return people.get(index).birthTown;
    }

    public String getBirthYear(int index) {
        return String.valueOf(people.get(index).birthYear);
    }

    
    public String getFirstName(int index) {
        return people.get(index).firstName;
    }

    public String getLastName(int index) {
        return people.get(index).lastName;
    }
    public Person.MaritalStatus getMaritalStatus(int index) {
        return people.get(index).maritalStatus;
    }
    
}
