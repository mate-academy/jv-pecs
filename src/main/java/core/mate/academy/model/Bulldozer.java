package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(int power) {
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
