package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private Truck truck1 = new Truck("Truck1", "blue", 33);
    private Truck truck2 = new Truck("Truck2", "brown", 38);

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
