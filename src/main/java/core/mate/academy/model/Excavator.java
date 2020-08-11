package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String powerEquipment;
    private String operationalPurpose;
    private String typeOfChassis;

    public Excavator() {
    }

    public Excavator(String powerEquipment, String operationalPurpose, String typeOfChassis) {
        this.powerEquipment = powerEquipment;
        this.operationalPurpose = operationalPurpose;
        this.typeOfChassis = typeOfChassis;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getPowerEquipment() {
        return powerEquipment;
    }

    public void setPowerEquipment(String powerEquipment) {
        this.powerEquipment = powerEquipment;
    }

    public String getOperationalPurpose() {
        return operationalPurpose;
    }

    public void setOperationalPurpose(String operationalPurpose) {
        this.operationalPurpose = operationalPurpose;
    }

    public String getTypeOfChassis() {
        return typeOfChassis;
    }

    public void setTypeOfChassis(String typeOfChassis) {
        this.typeOfChassis = typeOfChassis;
    }
}
