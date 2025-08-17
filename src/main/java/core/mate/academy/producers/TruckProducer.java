package core.mate.academy.producers;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck truckOne = new Truck("Small");
    private final Truck truckTwo = new Truck("Medium");
    private final Truck truckTree = new Truck("Big");

    @Override
    public List<Truck> get() {
        return List.of(truckOne, truckTwo, truckTree);
    }
}
