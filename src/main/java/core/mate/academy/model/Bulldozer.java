package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int digPerHour;
    private String factory;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int digPerHour, String factory) {
        super(name, color);
        this.digPerHour = digPerHour;
        this.factory = factory;
    }

    public int getDigPerHour() {
        return digPerHour;
    }

    public String getFactory() {
        return factory;
    }

    public void setDigPerHour(int digPerHour) {
        this.digPerHour = digPerHour;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
