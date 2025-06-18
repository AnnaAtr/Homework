public class Tanker extends Transport implements HasPropeller, CarriesCargo{
    @Override
    public void isTransport() {
        System.out.println("Танкер это транспортное средство");
    }

    @Override
    public void hasPropeller() {
        System.out.println("Танкер имеет винт");
    }

    @Override
    public void carriesCargo() {
        System.out.println("Танкер возит грузы");
    }
}
