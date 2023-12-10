package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int serialNumber;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int serialNumber) {
        super(name, color);
        this.serialNumber = serialNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
