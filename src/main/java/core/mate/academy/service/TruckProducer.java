package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck truck = new Truck();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        trucks.add(truck);
        trucks.add(truck1);
        trucks.add(truck2);
        return trucks;
    }
}
