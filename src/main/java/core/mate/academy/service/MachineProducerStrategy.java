package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.service.producerimpl.BulldozerProducerImpl;
import core.mate.academy.service.producerimpl.ExcavatorProducerImpl;
import core.mate.academy.service.producerimpl.TruckProducerImpl;
import java.util.ArrayList;

public class MachineProducerStrategy {
    public MachineProducer<? extends Machine> getMachineProducerStrategy(
            Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return new BulldozerProducerImpl();
            case "Excavator":
                return new ExcavatorProducerImpl();
            case "Truck":
                return new TruckProducerImpl();
            default:
                return (MachineProducer<Machine>) ArrayList::new;
        }
    }

}
