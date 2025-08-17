package core.mate.academy.service.impl;

import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("red", "Rider", 20));
        trucks.add(new Truck("white", "Horse", 25));
        return trucks;
    }
}
