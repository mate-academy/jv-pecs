package core.mate.academy.strategy;

import core.mate.academy.impl.BulldozerProducer;
import core.mate.academy.impl.ExcavatorProducer;
import core.mate.academy.impl.InvalidMachineProducer;
import core.mate.academy.impl.TruckProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.service.MachineProducer;

public class MachineProducerStrategy {
    public MachineProducer<? extends Machine> getMachineProducerByMachineType(String machineName) {
        switch (machineName) {
            case "Bulldozer":
                return new BulldozerProducer();
            case "Excavator":
                return new ExcavatorProducer();
            case "Truck":
                return new TruckProducer();
            default:
                return new InvalidMachineProducer();
        }
    }
}
