package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Signa", 10));
        trucks.add(new Truck("Intra", 4));
        trucks.add(new Truck("Ace", 4));
        trucks.add(new Truck("CLA", 6));
        return trucks;
    }
}
