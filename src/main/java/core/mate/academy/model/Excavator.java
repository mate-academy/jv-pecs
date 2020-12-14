package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String chassisType;
    private String operationPrinciple;
    private String destination;

    public Excavator() {
    }

    public Excavator (String chassisType, String operationPrinciple, String destination) {
        this.chassisType = chassisType;
        this.operationPrinciple = operationPrinciple;
        this.destination = destination;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
