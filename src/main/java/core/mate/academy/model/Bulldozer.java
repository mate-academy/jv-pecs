package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int mass;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int mass) {
        super(name, color);
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
