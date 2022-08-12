package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int operatingWeight;
    private String size;

    public Excavator() {
    }

    public Excavator(String color, String name, int operatingWeight, String size) {
        super(color, name);
        this.operatingWeight = operatingWeight;
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
