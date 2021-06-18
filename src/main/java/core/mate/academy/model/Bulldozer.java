package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bulldozerType) {
        super(name, color);
        this.bulldozerType = bulldozerType;
    }

    public String getBulldozerType() {
        return bulldozerType;
    }

    public void setBulldozerType(String bulldozerType) {
        this.bulldozerType = bulldozerType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
