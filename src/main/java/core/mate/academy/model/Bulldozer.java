package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String fuel;

    public Bulldozer() {

    }

    public Bulldozer(String fuel, String name, String color) {
        super(name, color);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
