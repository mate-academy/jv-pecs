package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("BIG-24", "yellow", 500));
        trucks.add(new Truck("BIG-25", "white", 1000));
        return trucks;
    }
}
