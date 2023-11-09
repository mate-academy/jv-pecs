package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean hasBlade;
    public Bulldozer() {
    }

    public boolean getHasBlade() {
        return hasBlade;
    }

    public void setHasBlade(boolean hasBlade) {
        this.hasBlade = hasBlade;
    }


    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
