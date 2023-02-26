package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
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
