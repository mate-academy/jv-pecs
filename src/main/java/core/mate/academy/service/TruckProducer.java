package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truckOne = new Truck("GMC", "White");
    private Truck truckTwo = new Truck("MACK", "Black");
    private Truck truckTree = new Truck("Ford", "Red");
    private final List<Truck> trucks = List.of(truckOne, truckTwo, truckTree);

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
