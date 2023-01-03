package core.mate.academy.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.HashMap;
import java.util.Map;

public class ProducerStrategy {
    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>>
            producers = new HashMap<>();

    public ProducerStrategy() {
        producers.put(Bulldozer.class, new BulldozerProducer());
        producers.put(Excavator.class, new ExcavatorProducer());
        producers.put(Truck.class, new TruckProducer());
    }

    public Map<Class<? extends Machine>, MachineProducer<? extends Machine>> getProducers() {
        return producers;
    }
}
