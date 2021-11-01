package core.mate.academy.model;

import core.mate.academy.service.producer.BulldozerProducer;
import core.mate.academy.service.producer.ExcavatorProducer;
import core.mate.academy.service.producer.MachineProducer;
import core.mate.academy.service.producer.TruckProducer;

public enum MachineTypes {
    BULLDOZER(new BulldozerProducer(), Bulldozer.class),
    TRUCK(new TruckProducer(), Truck.class),
    EXCAVATOR(new ExcavatorProducer(), Excavator.class);

    private final MachineProducer machineProducer;
    private final Class<? extends Machine> machineClass;

    MachineTypes(MachineProducer machineProducer,
                 Class<? extends Machine> machineClass) {
        this.machineProducer = machineProducer;
        this.machineClass = machineClass;
    }

    public MachineProducer getMachineProducer() {
        return machineProducer;
    }

    public Class<? extends Machine> getMachineClass() {
        return machineClass;
    }
}
