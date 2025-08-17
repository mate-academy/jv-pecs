package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String owner;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
