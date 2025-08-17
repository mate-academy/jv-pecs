package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean withWheels;
    private int bladeLength;

    public Bulldozer() {
    }

    public Bulldozer(boolean withWheels, int bladeLength) {
        this.withWheels = withWheels;
        this.bladeLength = bladeLength;
    }

    public boolean getWithWheels() {
        return withWheels;
    }

    public void setWithWheels(boolean withWheels) {
        this.withWheels = withWheels;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
