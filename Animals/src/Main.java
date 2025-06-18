public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.isAnimal();
        bear.isMammal();
        bear.hasSpine();
        bear.hasFur();
        System.out.println();
        Cat cat =  new Cat();
        cat.isAnimal();
        cat.isMammal();
        cat.hasSpine();
        cat.hasFur();
        System.out.println();
        Whale whale = new Whale();
        whale.isAnimal();
        whale.isMammal();
        whale.hasSpine();
        whale.livesInWater();
        System.out.println();
        Fish fish = new Fish();
        fish.isAnimal();
        fish.livesInWater();
    }
}