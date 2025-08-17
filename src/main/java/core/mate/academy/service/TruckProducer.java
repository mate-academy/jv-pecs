package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck newTruck = new Truck(2005, 12);
        Truck previousTruck = new Truck(1999, 18);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(newTruck);
        trucks.add(previousTruck);
        return trucks;
    }
}
