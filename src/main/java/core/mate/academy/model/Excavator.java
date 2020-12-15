package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorField;

    public Excavator() {
    }

    public int getExcavatorField() {
        return excavatorField;
    }

    public void setExcavatorField(int excavatorField) {
        this.excavatorField = excavatorField;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
