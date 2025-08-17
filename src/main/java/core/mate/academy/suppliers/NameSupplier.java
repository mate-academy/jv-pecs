package core.mate.academy.suppliers;

import core.mate.academy.enums.MachineType;

public class NameSupplier {
    public String getBulldozerName() {
        return MachineType.BULLDOZER.name().toLowerCase();
    }

    public String getExcavatorName() {
        return MachineType.EXCAVATOR.name().toLowerCase();
    }

    public String getTruckName() {
        return MachineType.TRUCK.name().toLowerCase();
    }
}
