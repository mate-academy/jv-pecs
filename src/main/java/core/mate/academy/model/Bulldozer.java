package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String workEquipmentType;
    private String controlSystem;
    private String specialFeatures;

    public Bulldozer() {
    }

    public Bulldozer(String workEquipmentType,
                     String controlSystem, String specialFeatures) {
        this.workEquipmentType = workEquipmentType;
        this.controlSystem = controlSystem;
        this.specialFeatures = specialFeatures;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getWorkEquipmentType() {
        return workEquipmentType;
    }

    public void setWorkEquipmentType(String workEquipmentType) {
        this.workEquipmentType = workEquipmentType;
    }

    public String getControlSystem() {
        return controlSystem;
    }

    public void setControlSystem(String controlSystem) {
        this.controlSystem = controlSystem;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}
