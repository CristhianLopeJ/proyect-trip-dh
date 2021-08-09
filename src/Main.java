package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Cris", 24, 12345);
//        String dateUser;
        Scanner dateEntry = new Scanner(System.in);
        System.out.println("BIENVENIDO, QUE OPERACION DESEA REALIZAR?");
        System.out.println("a: Ingresar como Usuario");
        System.out.println("b: Ingresar como Admin"); // TODO
        System.out.println("c: Salir");
        String input = dateEntry.nextLine();
        ArrayList<Trip> trips = getAvailableTrips();
        while (!input.equals("c")) {
            System.out.println("Viajes Disponibles: ");
            for (int i = 1; i <= trips.size(); i++) {
                System.out.print(i + ": ");
                System.out.print("Numero de viaje: " + trips.get(i - 1).getNumberTrip() + ", ");
                System.out.print("Destino: " + trips.get(i - 1).getDestiny().getNamePlace() + ", ");
                System.out.print("Vehiculo: " + trips.get(i - 1).getTransport().getName());
                System.out.print(", # de Asientos: " + trips.get(i - 1).getTransport().getNumberSeats());
                System.out.println();
            }

            System.out.println("Elija un viaje: ");
            String viajeElegido = dateEntry.nextLine();
            switch (viajeElegido) {
                case "1":
                    trips.get(0).addPerson(person);
                    System.out.println("Exitoso");
                    System.out.println(trips.get(0));
                    break;
                case "2":
                    trips.get(1).addPerson(person);
                    System.out.println("Exitoso");
                    System.out.println(trips.get(1));
                    break;
                case "3":
                    trips.get(2).addPerson(person);
                    System.out.println("Exitoso");
                    System.out.println(trips.get(2));
                    break;
                case "4":
                    trips.get(3).addPerson(person);
                    System.out.println("Exitoso");
                    System.out.println(trips.get(3));
                    break;
                case "5":
                    trips.get(4).addPerson(person);
                    System.out.println("Exitoso");
                    System.out.println(trips.get(4));
                    break;
            }

            input = dateEntry.nextLine();
        }

    }

    private static ArrayList<Trip> getAvailableTrips() {
        ArrayList<Transport> transports = getTransports();
        ArrayList<Destiny> destinies = getDestinies();
        ArrayList<Trip> trips = new ArrayList<>();

        trips.add(new Trip(new ArrayList<>(), transports.get(0), destinies.get(0), "1A"));
        trips.add(new Trip(new ArrayList<>(), transports.get(1), destinies.get(1), "1B"));
        trips.add(new Trip(new ArrayList<>(), transports.get(2), destinies.get(2), "1C"));
        trips.add(new Trip(new ArrayList<>(), transports.get(3), destinies.get(3), "1D"));
        trips.add(new Trip(new ArrayList<>(), transports.get(4), destinies.get(4), "1E"));

        return trips;
    }

    private static ArrayList<Destiny> getDestinies() {
        ArrayList<Destiny> destinies = new ArrayList<>();
        destinies.add(new Destiny("Bolivia", "Cbba", "Toro Toro"));
        destinies.add(new Destiny("Bolivia", "Cbba ", "Villa Tunari"));
        destinies.add(new Destiny("Chile", "Santiago ", "Basilica"));
        destinies.add(new Destiny("Chile", "Santiago ", " Basilica"));
        destinies.add(new Destiny("Chile", "Santiago ", " Basilica"));

        return destinies;
    }


    private static ArrayList<Transport> getTransports() {
        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(new TransportAir("Avion", "COMMERCIAL", 50));
        transports.add(new TransportAir("Avion", "COMMERCIAL", 100));
        transports.add(new TransportAir("Avion", "COMMERCIAL", 150));
        transports.add(new TransportLand("Car", 4));
        transports.add(new TransportLand("Bus", 50));

        return transports;
    }

}
