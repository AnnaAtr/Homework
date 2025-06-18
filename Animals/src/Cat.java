public class Cat extends Mammal implements HasFur{
    @Override
    public void hasFur() {
        System.out.println("У кошки есть шерсть");
    }
    @Override
    public void isMammal() {
        System.out.println("Кошка есть млекопитающее");
    }
}
