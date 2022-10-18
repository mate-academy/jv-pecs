package core.mate.academy.model;

public class Excavator extends Machine {
    private int specialExcavatorField;

    public Excavator() {
    }

    public void setSpecialExcavatorField(int specialExcavatorField) {
        this.specialExcavatorField = specialExcavatorField;
    }

    public int getSpecialExcavatorField() {
        return specialExcavatorField;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
