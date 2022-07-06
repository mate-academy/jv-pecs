package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorModel;
    private int excavatorAge;

    public Excavator() {
    }

    public Excavator(String excavatorModel, int excavatorAge) {
        this.excavatorModel = excavatorModel;
        this.excavatorAge = excavatorAge;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getExcavatorAge() {
        return excavatorAge;
    }

    public void setExcavatorAge(int excavatorAge) {
        this.excavatorAge = excavatorAge;
    }

    public String getExcavatorModel() {
        return excavatorModel;
    }

    public void setExcavatorModel(String excavatorModel) {
        this.excavatorModel = excavatorModel;
    }
}
