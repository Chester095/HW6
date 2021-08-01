public class Test {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Бобик", 200, 150);
        Animal dog2 = new Dog("Шарик", 300, 250);
        Animal cat1 = new Cat("Мурзик", 300, 50);
        Animal cat2 = new Cat("Гав", 400, 25);
        doProcess(dog1);
        doProcess(dog2);
        doProcess(cat1);
        doProcess(cat2);

    }

    public static void doProcess(Animal animal) {
        animal.printAnimalInfo();
    }
}
