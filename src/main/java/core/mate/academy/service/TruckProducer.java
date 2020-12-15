package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        Truck first = new Truck("First", "White", false, 50);
        Truck second = new Truck("Second", "Yellow", false, 60);
        Truck third = new Truck("Third", "Black", true, 70);
        trucks.add(first);
        trucks.add(second);
        trucks.add(third);
        return trucks;
    }
}
