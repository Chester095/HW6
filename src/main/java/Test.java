public class Test {
    public static void main(String[] args) {
        // создаём объекты с учётом ограничений
        Animal dog1 = new Dog("Бобик", 200, 150);
        Dog dog2 = new Dog("Шарик", 300, 250);
        Animal cat1 = new Cat("Мурзик", 300, 50);
        Animal cat2 = new Cat("Гав", 400, 25);
        Animal cat3 = new Cat("Белка", 100, 25);

        // проверяем эти объекты
        printAnimalInfo(dog1);
        printAnimalInfo(dog2);
        printAnimalInfo(cat1);
        printAnimalInfo(cat2);
        printAnimalInfo(cat3); System.out.println();

        // проверяем изменение значений с учётом ограничений
        dog1.run(150); dog1.swim(9);
        dog2.run(150); dog2.swim(150);
        cat1.run(199); cat1.swim(150); System.out.println();

        // проверяем эти объекты
        printAnimalInfo(dog1);
        printAnimalInfo(dog2);
        printAnimalInfo(cat1);
        printAnimalInfo(cat2);
        printAnimalInfo(cat3); System.out.println();

        // проверяем вывод информации о кол-ве животных
        Animal.quantityAnimals();
    }

    public static void printAnimalInfo(Animal animal) {
        animal.printAnimalInfo();
    }

}
