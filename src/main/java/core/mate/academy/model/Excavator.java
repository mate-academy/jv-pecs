package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorId;
    private String excavatorModel;

    public Excavator() {
    }

    public Excavator(int excavatorId, String excavatorModel) {
        this.excavatorId = excavatorId;
        this.excavatorModel = excavatorModel;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getExcavatorId() {
        return excavatorId;
    }

    public void setExcavatorId(int excavatorId) {
        this.excavatorId = excavatorId;
    }
    public String getExcavatorModel() {
        return excavatorModel;
    }

    public void setExcavatorModel(String excavatorModel) {
        this.excavatorModel = excavatorModel;
    }
}
