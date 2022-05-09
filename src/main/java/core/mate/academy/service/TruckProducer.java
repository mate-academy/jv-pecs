package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck();
    private Truck truck2 = new Truck();
    private Truck truck3 = new Truck();
    private List<Truck> trucks = List.of(truck1, truck2, truck3);

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
