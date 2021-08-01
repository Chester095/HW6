public class Dog extends Animal {
    private int idDog=0;
    private String name;

    public void run(int length) {
        setRun(length);
        System.out.println(name + " теперь может пробежать " + length + "м.");

    }

    @Override
    public void printAnimalInfo(){
        System.out.println("Id: "+ idDog + "  Кличка: " + name + "  Пробегает: " + getRun()+ "м.  Проплывает: " + getSwim() + "м.");
    }


    public Dog(String name, int run, int swim) {
        this.idDog = number();
        this.name = name;
        this.setRun(run);
        this.setSwim(swim);
    }

    private int number() {
        return idDog++;
    }


    public String getName() {
        return name;
    }

    public int getIdDog() {
        return idDog;
    }
}
