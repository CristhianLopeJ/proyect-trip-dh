package src;

public class TransportAir extends Transport {
    //commercial TRIP or private TRIP
    private String typeFlight; //commmercial or private

    public TransportAir(String name, String typeFlight, int numberSeats) {
        super(name, numberSeats);
        this.typeFlight = typeFlight;
    }

    public String getTypeFlight() {
        return typeFlight;
    }
}
