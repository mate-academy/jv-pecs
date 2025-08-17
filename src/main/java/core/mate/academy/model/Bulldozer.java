package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maxPower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int maxPower) {
        super(name, color);
        this.maxPower = maxPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
