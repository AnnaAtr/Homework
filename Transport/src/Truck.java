public class Truck extends Transport implements HasWheels, CarriesCargo{
    @Override
    public void isTransport() {
        System.out.println("Грузовик это транспортное средство");
    }
    @Override
    public void hasWheels() {
        System.out.println("Грузовик имеет колеса");
    }
    @Override
    public void carriesCargo() {
        System.out.println("Грузовик возит грузы");
    }
}
