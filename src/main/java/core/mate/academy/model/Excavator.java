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

    public Excavator(String name, String color, String chassisType,
                     String operationPrinciple, String destination) {
        super(name, color);
        this.chassisType = chassisType;
        this.operationPrinciple = operationPrinciple;
        this.destination = destination;
    }

    public String getChassisType() {
        return chassisType;
    }

    public String getOperationPrinciple() {
        return operationPrinciple;
    }

    public String getDestination() {
        return destination;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public void setOperationPrinciple(String operationPrinciple) {
        this.operationPrinciple = operationPrinciple;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
