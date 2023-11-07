package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String driveType;
    private String chassisType;
    private String operationalPurpose;

    public Excavator() {
    }

    public Excavator(String driveType, String chassisType, String operationalPurpose) {
        this.driveType = driveType;
        this.chassisType = chassisType;
        this.operationalPurpose = operationalPurpose;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
