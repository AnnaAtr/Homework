public class Fish extends Animal implements LivesInWater {
    @Override
    public void isAnimal() {
        System.out.println("Рыба есть животное");
    }
    @Override
    public void livesInWater() {
        System.out.println("Рыба живет в воде");
    }
}
