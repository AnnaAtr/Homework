public class Bear extends Mammal implements HasFur {
    @Override
    public void isMammal() {
        System.out.println("Медведь есть млекопитающее");
    }
    @Override
    public void hasFur() {
        System.out.println("У медведя есть шерсть");
    }
}
