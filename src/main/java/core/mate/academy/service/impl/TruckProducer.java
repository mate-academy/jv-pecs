package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck one = new Truck("OneTruck", "Green", 100);
        Truck two = new Truck("TwoTruck", "Red", 200);
        List<Truck> trucks = new ArrayList<>();
        trucks.add(one);
        trucks.add(two);
        return trucks;
    }
}
