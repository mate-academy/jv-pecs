package core.mate.academy.model;

public class Excavator extends Machine {
    private String undercarriageType;
    private String principleOfOperation;
    private String operationalPurpose;

    public Excavator() {
    }

    public Excavator(String undercarriageType, String principleOfOperation, String operationalPurpose) {
        this.undercarriageType = undercarriageType;
        this.principleOfOperation = principleOfOperation;
        this.operationalPurpose = operationalPurpose;
    }

    public String getUndercarriageType() {
        return undercarriageType;
    }

    public String getPrincipleOfOperation() {
        return principleOfOperation;
    }

    public String getOperationalPurpose() {
        return operationalPurpose;
    }

    public void setUndercarriageType(String undercarriageType) {
        this.undercarriageType = undercarriageType;
    }

    public void setPrincipleOfOperation(String principleOfOperation) {
        this.principleOfOperation = principleOfOperation;
    }

    public void setOperationalPurpose(String operationalPurpose) {
        this.operationalPurpose = operationalPurpose;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
