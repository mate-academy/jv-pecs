package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean isBig;

    public Bulldozer() {
    }

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
