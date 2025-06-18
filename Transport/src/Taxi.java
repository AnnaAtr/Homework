public class Taxi extends Transport implements HasWheels{
    @Override
    public void hasWheels() {
        System.out.println("Такси имеет колеса");
    }
    @Override
    public void isTransport() {
        System.out.println("Такси это транспортное средство");
    }
}
