package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("First truck", "white", 25));
        trucks.add(new Truck("Second truck", "blue", 30));
        trucks.add(new Truck("Second truck", "red", 35));
        return trucks;
    }
}
