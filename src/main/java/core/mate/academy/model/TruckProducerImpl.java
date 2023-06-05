package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private Truck truck1 = new Truck("Tr1", 10, 20);
    private Truck truck2 = new Truck("Tr1", 30, 40);
    private Truck truck3 = new Truck("Tr1", 50, 60);

    @Override
    public List<Truck> get() {
        return List.of(truck1, truck2, truck3);
    }
}
