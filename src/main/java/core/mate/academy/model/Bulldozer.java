package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldozerNumber;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bulldozerNumber) {
        super(name, color);
        this.bulldozerNumber = bulldozerNumber;
    }

    public int getBulldozerNumber() {
        return bulldozerNumber;
    }

    public void setBulldozerNumber(int bulldozerNumber) {
        this.bulldozerNumber = bulldozerNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
