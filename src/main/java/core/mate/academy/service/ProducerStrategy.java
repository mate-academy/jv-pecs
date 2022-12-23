package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

public class ProducerStrategy {
    private final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Truck> truckProducer = new TruckProducer();

    public MachineProducer<? extends Machine> getMachineProducer(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return bulldozerProducer;
        }
        if (type == Excavator.class) {
            return excavatorProducer;
        }
        if (type == Truck.class) {
            return truckProducer;
        }
        throw new RuntimeException("Got invalid class for producer. Please, input valid class");
    }
}
