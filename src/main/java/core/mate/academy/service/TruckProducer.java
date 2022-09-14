package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("Caterpillar", "red", 500));
        trucks.add(new Truck("Crawler", "green", 700));
        trucks.add(new Truck("John Deere", "yellow", 600));
        return trucks;
    }
}
