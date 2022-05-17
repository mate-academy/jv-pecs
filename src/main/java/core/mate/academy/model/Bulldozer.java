package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;
    private int width;

    public Bulldozer() {
    }

    public Bulldozer(int power, int width) {
        this.power = power;
        this.width = width;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
