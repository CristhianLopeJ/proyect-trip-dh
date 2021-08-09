package src;

public class Transport {
    protected String name;
    protected int numberSeats;

    public Transport(String name, int numberSeats) {
        this.numberSeats = numberSeats;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Seats number: " + numberSeats;
    }
}
