package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int enginePower;
    private String workingType;

    public Excavator() {
    }

    public Excavator(String name, String color, int enginePower, String workingType) {
        super(name, color);
        this.enginePower = enginePower;
        this.workingType = workingType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getWorkingType() {
        return workingType;
    }

    public void setWorkingType(String workingType) {
        this.workingType = workingType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
