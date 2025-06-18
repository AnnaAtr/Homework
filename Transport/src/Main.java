public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.isTransport();
        airplane.hasWheels();
        airplane.hasPropeller();
        airplane.hasWings();
        airplane.carriesCargo();
        System.out.println();
        Helicopter helicopter = new Helicopter();
        helicopter.isTransport();
        helicopter.hasPropeller();
        helicopter.hasWheels();
        helicopter.carriesCargo();
        System.out.println();
        Boat boat = new Boat();
        boat.isTransport();
        boat.hasPropeller();
        boat.carriesCargo();
        System.out.println();
        Tanker tanker = new Tanker();
        tanker.isTransport();
        tanker.hasPropeller();
        tanker.carriesCargo();
        System.out.println();
        Truck truck = new Truck();
        truck.isTransport();
        truck.hasWheels();
        truck.carriesCargo();
        System.out.println();
        Taxi taxi = new Taxi();
        taxi.isTransport();
        taxi.hasWheels();
    }
}