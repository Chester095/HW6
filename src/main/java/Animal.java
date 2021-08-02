public abstract class Animal {
    private int run, swim;
    private static int quantity;
    public static final int runCatLimit = 200, runDogLimit = 500, swimCatLimit = 0, swimDogLimit=10;

    {quantity++;/*считаем общее кол-во животных*/}

    public abstract void run(int length); // метод из Пункта 2 ДЗ

    public abstract void swim(int length); // метод из Пункта 2 ДЗ

    public void printAnimalInfo(){ } // метод вывода всей информации о кошке

    public void setAnimalRun(int run) {this.run = run;}

    public void setAnimalSwim(int swim) {this.swim = swim;}

    public int getRun() {
        return run;
    }

    public void setRun(int run) {this.run = run;}

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public static void quantityAnimals() {
        System.out.println("Кол-во котов = " + Cat.getCatQuantity() + "\nКол-во собак = " + Dog.getDogQuantity() + "\nКол-во животных = " + quantity);
    }


}
