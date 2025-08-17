package core.mate.academy.model;

public class Excavator extends Machine {
    private String actionPrinciple;
    private String powerEquipmentType;
    private String movingEquipmentType;

    public Excavator() {
    }

    public Excavator(String actionPrinciple, String powerEquipmentType,
                     String movingEquipmentType) {
        this.actionPrinciple = actionPrinciple;
        this.powerEquipmentType = powerEquipmentType;
        this.movingEquipmentType = movingEquipmentType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getActionPrinciple() {
        return actionPrinciple;
    }

    public void setActionPrinciple(String actionPrinciple) {
        this.actionPrinciple = actionPrinciple;
    }

    public String getPowerEquipmentType() {
        return powerEquipmentType;
    }

    public void setPowerEquipmentType(String powerEquipmentType) {
        this.powerEquipmentType = powerEquipmentType;
    }

    public String getMovingEquipmentType() {
        return movingEquipmentType;
    }

    public void setMovingEquipmentType(String movingEquipmentType) {
        this.movingEquipmentType = movingEquipmentType;
    }
}
