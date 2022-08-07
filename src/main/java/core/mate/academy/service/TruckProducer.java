package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(2000, 4.0, "black"));
        trucks.add(new Truck(2200, 4.2, "white"));
        trucks.add(new Truck(1500, 3.0, "blue"));
        return trucks;
    }
}
