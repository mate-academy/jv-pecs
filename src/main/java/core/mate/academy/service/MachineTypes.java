package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

public enum MachineTypes {
    BULLDOZER(new BulldozerProducer(), Bulldozer.class),
    TRUCK(new TruckProducer(), Truck.class),
    EXCAVATOR(new ExcavatorProducer(), Excavator.class);

    private final MachineProducer<? extends Machine> machineProducer;
    private final Class<? extends Machine> machineClass;

    MachineTypes(MachineProducer<? extends Machine> machineProducer,
                 Class<? extends Machine> machineClass) {
        this.machineProducer = machineProducer;
        this.machineClass = machineClass;
    }

    public MachineProducer<? extends Machine> getMachineProducer() {
        return machineProducer;
    }

    public Class<? extends Machine> getMachineClass() {
        return machineClass;
    }
}
