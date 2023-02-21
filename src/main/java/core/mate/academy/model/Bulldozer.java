package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int scoop;

    public Bulldozer() {
    }

    public Bulldozer(int scoop) {
        this.scoop = scoop;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getScoop() {
        return scoop;
    }

    public void setScoop(int scoop) {
        this.scoop = scoop;
    }
}
