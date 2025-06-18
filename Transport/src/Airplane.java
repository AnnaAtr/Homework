public class Airplane extends Transport implements HasWheels, HasPropeller, HasWings, CarriesCargo{
    @Override
    public void isTransport() {
        System.out.println("Самолет это транспортное средство");
    }
    @Override
    public void hasWheels() {
        System.out.println("Самолет имеет колеса");
    }
    @Override
    public void hasPropeller() {
        System.out.println("Самолет имеет винт");
    }
    @Override
    public void hasWings() {
        System.out.println("Самолет имеет крылья");
    }
    @Override
    public void carriesCargo() {
        System.out.println("Самолет возит грузы");
    }
}
