package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double workSpeed;
    private double height;

    public Bulldozer() {
    }

    public double getWorkSpeed() {
        return workSpeed;
    }

    public void setWorkSpeed(double workSpeed) {
        this.workSpeed = workSpeed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
