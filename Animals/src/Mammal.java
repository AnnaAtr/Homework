public abstract class Mammal extends Animal implements HasSpine {
    @Override
    public  void hasSpine() {
        System.out.println("У млекопитающих есть позвоночник");
    }
    @Override
    public void isAnimal() {
        System.out.println("Млекопитающее есть животное");
    }
    public void isMammal() {
        System.out.println("Это млекопитающее");
    }
}
