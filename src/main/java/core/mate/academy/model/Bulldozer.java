package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int enginePower;
    private int height;

    public Bulldozer() {

    }

    public Bulldozer(int enginePower, int height, String name, String color) {
        this.enginePower = enginePower;
        this.height = height;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
