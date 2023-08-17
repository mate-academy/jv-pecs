package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Scania", "Black", 30, 12));
        trucks.add(new Truck("Reno", "Blue", 25, 10));
        trucks.add(new Truck("Iveco", "Yellow", 40, 15));
        return trucks;
    }
}
