package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String operationalPurpose;

    public Excavator() {
    }

    public Excavator(String operationalPurpose) {
        this.operationalPurpose = operationalPurpose;
    }

    public String getOperationalPurpose() {
        return operationalPurpose;
    }

    public void setOperationalPurpose(String operationalPurpose) {
        this.operationalPurpose = operationalPurpose;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
