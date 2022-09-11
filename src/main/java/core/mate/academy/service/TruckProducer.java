package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(15, 6));
        trucks.add(new Truck(25, 8));
        trucks.add(new Truck(40, 12));
        return trucks;
    }
}
