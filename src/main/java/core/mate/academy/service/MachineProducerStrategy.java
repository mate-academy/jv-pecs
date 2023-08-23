package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producerimpl.BulldozerProducerImpl;
import core.mate.academy.service.producerimpl.ExcavatorProducerImpl;
import core.mate.academy.service.producerimpl.TruckProducerImpl;
import java.util.ArrayList;

public class MachineProducerStrategy {
    public MachineProducer<? extends Machine> getMachineProducerStrategy(
            Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducerImpl();
        } else if (type == Truck.class) {
            return new TruckProducerImpl();
        } else if (type == Excavator.class) {
            return new ExcavatorProducerImpl();
        } else {
            return (MachineProducer<Machine>) ArrayList::new;
        }
    }
}
