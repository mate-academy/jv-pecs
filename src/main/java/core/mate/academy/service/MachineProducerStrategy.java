package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.service.producerimpl.BulldozerProducerImpl;
import core.mate.academy.service.producerimpl.ExcavatorProducerImpl;
import core.mate.academy.service.producerimpl.TruckProducerImpl;
import java.util.Optional;

public class MachineProducerStrategy {
    public Optional<MachineProducer<?>> getMachineProducerStrategy(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return Optional.of(new BulldozerProducerImpl());
            case "Excavator":
                return Optional.of(new ExcavatorProducerImpl());
            case "Truck":
                return Optional.of(new TruckProducerImpl());
            default:
                return Optional.empty();
        }
    }

}
