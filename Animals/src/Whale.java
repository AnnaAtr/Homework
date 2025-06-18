public class Whale extends Mammal implements LivesInWater {
    @Override
    public void isMammal() {
        System.out.println("Кит есть млекопитающее");
    }
    @Override
    public void livesInWater() {
        System.out.println("Кит живет в воде");
    }
}
