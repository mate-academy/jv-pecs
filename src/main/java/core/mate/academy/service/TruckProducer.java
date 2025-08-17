package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck newTruck = new Truck("Toyota", 2012);
        Truck oldTruck = new Truck("Ford", 2015);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(newTruck);
        trucks.add(oldTruck);
        return trucks;
    }
}
