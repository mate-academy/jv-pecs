package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean scoop = false;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, boolean scoop) {
        this.setName(name);
        this.setColor(color);
        this.scoop = scoop;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setScoop(boolean scoop) {
        this.scoop = scoop;
    }
}
