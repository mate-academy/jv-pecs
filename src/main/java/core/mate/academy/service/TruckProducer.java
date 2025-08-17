package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.Arrays;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final Truck truck = new Truck();
    private final Truck truck1 = new Truck();
    private final Truck truck2 = new Truck();

    public List<Truck> get() {
        List<Truck> trucks = Arrays.asList(truck, truck1, truck2);
        return trucks;
    }
}
