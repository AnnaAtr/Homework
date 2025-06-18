public class Helicopter extends Transport implements HasWheels, HasPropeller, CarriesCargo{
    @Override
    public void isTransport() {
        System.out.println("Вертолет это транспортное средство");
    }
    @Override
    public void hasWheels() {
        System.out.println("Вертолет имеет колеса");
    }
    @Override
    public void hasPropeller() {
        System.out.println("Вертолет имеет винт");
    }
    @Override
    public void carriesCargo() {
        System.out.println("Вертолет возит грузы");
    }
}
