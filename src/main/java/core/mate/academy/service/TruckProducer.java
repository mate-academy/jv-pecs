package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("MyLovelyTruck1", "white", "CONTRACTOR", 1000));
        trucks.add(new Truck("MyLovelyTruck2", "black", "FLAT BED", 100));
        trucks.add(new Truck("MyLovelyTruck3", "gray", "VAN", 10000));
        return trucks;
    }
}
