package core.mate.academy.model;

import java.util.List;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String equipmentType;

    public Truck(String name, String equipmentType, String color) {
        this.equipmentType = equipmentType;
    }

    public Truck() {
        super();
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
