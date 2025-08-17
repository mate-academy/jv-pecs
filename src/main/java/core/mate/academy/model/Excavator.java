package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {
    private String type;
    private int operatingWeight;

    public Excavator(String type, int operatingWeight) {
        this.type = type;
        this.operatingWeight = operatingWeight;
    }

    public Excavator() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
