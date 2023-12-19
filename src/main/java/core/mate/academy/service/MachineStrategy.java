package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

public class MachineStrategy {
    public MachineProducer<? extends Machine> getMachineProducer(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer();
        } else if (type == Excavator.class) {
            return new ExcavatorProducer();
        } else if (type == Truck.class) {
            return new TruckProducer();
        } else {
            return null;
        }
    }

}
