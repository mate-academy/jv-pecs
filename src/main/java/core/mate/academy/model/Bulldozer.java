package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int shovelSize;

    public Bulldozer() {
    }

    public int getShovelSize() {
        return shovelSize;
    }

    public void setShovelSize(int shovelSize) {
        this.shovelSize = shovelSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
