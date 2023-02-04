package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeExcavator;
    private int weightExcavator;

    public Excavator() {
    }

    public Excavator(String typeExcavator, int weightExcavator) {
        this.typeExcavator = typeExcavator;
        this.weightExcavator = weightExcavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
