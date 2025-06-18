public class Boat extends Transport implements HasPropeller, CarriesCargo{
    @Override
    public void isTransport() {
        System.out.println("Катер это транспортное средство");
    }

    @Override
    public void hasPropeller() {
        System.out.println("Катер имеет винт");
    }

    @Override
    public void carriesCargo() {
        System.out.println("Катер возит грузы");
    }
}
