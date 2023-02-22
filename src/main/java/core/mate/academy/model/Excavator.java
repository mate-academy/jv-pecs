package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String powerEquipment;

    public Excavator() {
    }

    public Excavator(String name, String color, String powerEquipment) {
        super(name, color);
        this.powerEquipment = powerEquipment;
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
}
