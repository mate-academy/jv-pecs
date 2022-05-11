package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private String model;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String model) {
        super(name, color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Bulldozer setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
