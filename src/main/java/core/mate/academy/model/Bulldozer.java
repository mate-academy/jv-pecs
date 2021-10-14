package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int wight;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setWight(int wight) {
        this.wight = wight;
    }
}
