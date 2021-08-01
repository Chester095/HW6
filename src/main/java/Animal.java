public abstract class Animal {
    private int run;
    private int swim;


    public void printAnimalInfo(){
        System.out.println("Животное");
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }


}
