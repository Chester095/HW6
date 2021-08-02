public class Dog extends Animal {
    private static int quantityDog;
    private String name; // можно конечно было вставить в класс Animal

    {quantityDog++;/*считаем кол-во собак*/}

    @Override // метод из Пункта 2 ДЗ
    public void run(int run) {
        setAnimalRun(run);
        System.out.println("Собака "+ name + " теперь может пробежать " + getRun() + "м.");
    }

    @Override // метод из Пункта 2 ДЗ
    public void swim(int swim) {
        setAnimalSwim(swim);
        System.out.println("Собака "+ name + " теперь может проплыть " + getSwim() + "м.");
    }

    @Override // метод вывода всей информации о собаке
    public void printAnimalInfo() {
        System.out.println("Кличка собаки: " + name + "  Пробегает: " + getRun()+ "м.  Проплывает: " + getSwim() + "м.");
    }

    @Override // метод проверки ограничения дальности бега и задания нового значения
    public void setAnimalRun(int run) {if (run <= runDogLimit) setRun(run); else setRun(runDogLimit);}

    @Override // метод проверки ограничения дальности плавания и задания нового значения
    public void setAnimalSwim(int swim) {if (swim <= swimDogLimit) setSwim(swim); else setSwim(swimDogLimit);}

    public Dog(String name, int run, int swim) {
        this.name = name;
        this.setAnimalRun(run);
        this.setAnimalSwim(swim);
    }

    public static int getDogQuantity() {
        return quantityDog;
    }
}
