package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    TruckProducer() {

    }

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(45, 12, "Semi-trailer"));
        trucks.add(new Truck(65, 66, "Tanker"));
        trucks.add(new Truck(23, 90, "Dump"));
        return trucks;
    }
}
