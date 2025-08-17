package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(1.1,1988));
        trucks.add(new Truck(1.2,1989));
        trucks.add(new Truck(1.3,1990));
        return trucks;
    }
}
