public class Cat extends Animal {
    int idCat;
    String name;

    public void run(int length) {
        setRun(length);
        System.out.println(name + " теперь может пробежать " + length + "м.");

    }

    @Override
    public void printAnimalInfo() {
        System.out.println("Id: " + getIdCat() + "  Кличка: " + getName() + "  Пробегает: " + getRun() + "м.  Проплывает: " + getSwim() + "м.");
    }

    public Cat(String name, int run, int swim) {
        this.idCat++;
        this.name = name;
        this.setRun(run);
        this.setSwim(swim);
    }

    public String getName() {
        return name;
    }

    public int getIdCat() {
        return idCat;
    }
}
