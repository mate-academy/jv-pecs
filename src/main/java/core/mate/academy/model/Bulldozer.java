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
        setName(name);
        setColor(color);
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
