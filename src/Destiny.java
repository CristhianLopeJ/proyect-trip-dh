package src;

public class Destiny {
    private String nameCountry;
    private String nameCity;
    private String namePlace;

    public Destiny(String nameCountry, String nameCity, String namePlace) {
        this.nameCountry = nameCountry;
        this.nameCity = nameCity;
        this.namePlace = namePlace;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public String getNameCity() {
        return nameCity;
    }

    public String getNamePlace() {
        return namePlace;
    }

    @Override
    public String toString() {
        return "Place: " + namePlace + " City: " + nameCity + " Country: " + nameCountry;
    }
}





