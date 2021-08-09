package src;

import java.util.ArrayList;

public class Trip {
    private String numberTrip;
    private ArrayList<Person> persons;
    private Transport transport;
    private Destiny destiny;

    public Trip(ArrayList<Person> persons, Transport transport, Destiny destiny, String numberTrip) {
        this.numberTrip = numberTrip;
        this.persons = persons;
        this.transport = transport;
        this.destiny = destiny;
    }

    public String getNumberTrip() {
        return numberTrip;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) { //add a person
        persons.add(person);
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Destiny getDestiny() {
        return destiny;
    }

    public void setDestiny(Destiny destiny) {
        this.destiny = destiny;
    }

    @Override
    public String toString() {
        return "Trip Number: " + numberTrip + ", Passengers: " + persons + ", Transport:" + transport;
    }
}
