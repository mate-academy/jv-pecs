package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

public class ProducerStrategy {
    public MachineProducer<? extends Machine> getMachineProducer(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer();
        }
        if (type == Excavator.class) {
            return new ExcavatorProducer();
        }
        if (type == Truck.class) {
            return new TruckProducer();
        }
        return null;
    }
}
