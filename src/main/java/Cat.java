public class Cat extends Animal {
    private static int quantityCat;
    private String name; // можно конечно было вставить в класс Animal

    {quantityCat++;/*считаем кол-во кошек*/}

    @Override // метод из Пункта 2 ДЗ
    public void run(int run) {
        setAnimalRun(run);
        System.out.println("Кошака "+ name + " теперь может пробежать " + getRun() + "м.");
    }

    @Override // метод из Пункта 2 ДЗ
    public void swim(int swim) {
        setAnimalSwim(swim);
        System.out.println("Кошака "+ name + " теперь может героически проплыть " + getSwim() + "м.");
    }

    @Override // метод вывода всей информации о кошке
    public void printAnimalInfo() {
        System.out.println("Кличка кошки: " + name + "  Пробегает: " + getRun() + "м.  Проплывает: " + getSwim() + "м.");
    }

    @Override // метод проверки ограничения дальности бега и задания нового значения
    public void setAnimalRun(int run) {if (run <= runCatLimit) setRun(run); else setRun(runCatLimit);}

    @Override // метод проверки ограничения дальности плавания и задания нового значения
    public void setAnimalSwim(int swim) {if (swim <= swimCatLimit) setSwim(swim); else setSwim(swimCatLimit);}

    public Cat(String name, int run, int swim) {
        this.name = name;
        this.setAnimalRun(run);
        this.setAnimalSwim(swim);
    }

    public static int getCatQuantity() {
        return quantityCat;
    }
}
