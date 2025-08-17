package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int lanceLength;
    private String model;

    public Excavator() {
    }

    public Excavator(int lanceLength, String model) {
        this.lanceLength = lanceLength;
        this.model = model;
    }

    public int getLanceLength() {
        return lanceLength;
    }

    public Excavator setLanceLength(int lanceLength) {
        this.lanceLength = lanceLength;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Excavator setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
