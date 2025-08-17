package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;
    private String manufacturer;

    public Bulldozer() {
    }

    public Bulldozer(int power, String manufacturer, String color) {
        this.power = power;
        this.manufacturer = manufacturer;
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
