package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double groundPressure;

    public Bulldozer(String name, String color, double groundPressure) {
        this.setName(name);
        this.setColor(color);
        this.groundPressure = groundPressure;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getGroundPressure() {
        return groundPressure;
    }

    public void setGroundPressure(double groundPressure) {
        this.groundPressure = groundPressure;
    }
}
