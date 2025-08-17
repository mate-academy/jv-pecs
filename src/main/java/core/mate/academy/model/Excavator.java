package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxWeight = 12000;

    public Excavator() {
    }

    public Excavator(String name, String color, int maxWeight) {
        this.setName(name);
        this.setColor(color);
        this.maxWeight = maxWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
