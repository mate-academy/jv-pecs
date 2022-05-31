package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double high;
    private double bladeLength;

    public Bulldozer() {
    }

    public Bulldozer(double high, double bladeLength) {
        this.high = high;
        this.bladeLength = bladeLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

}
