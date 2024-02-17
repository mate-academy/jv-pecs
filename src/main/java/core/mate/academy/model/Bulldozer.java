package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
