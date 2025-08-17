package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck("Renault", "Red", 10, 20);
        Truck secondTruck = new Truck("Mercedes", "Black", 10, 21);
        List<Truck> trucks = new LinkedList<>();
        trucks.add(firstTruck);
        trucks.add(secondTruck);
        return trucks;
    }
}
