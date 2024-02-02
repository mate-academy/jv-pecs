package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int weight;
    private int liftCapacity;

    public Excavator() {
    }

    public Excavator(int weight, int liftCapacity, String name, String color) {
        this.weight = weight;
        this.liftCapacity = liftCapacity;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
