package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int numberOfExcavator;
    private String type;

    public Excavator(int numberOfExcavator, String type) {
        this.numberOfExcavator = numberOfExcavator;
        this.type = type;
    }

    public Excavator() {
    }

    public int getNumberOfExcavator() {
        return numberOfExcavator;
    }

    public void setNumberOfExcavator(int numberOfExcavator) {
        this.numberOfExcavator = numberOfExcavator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
