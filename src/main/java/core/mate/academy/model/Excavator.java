package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String chainType;

    public Excavator() {
        super();
    }

    public Excavator(String name, String color, String chainType) {
        super(name, color);
        this.chainType = chainType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
