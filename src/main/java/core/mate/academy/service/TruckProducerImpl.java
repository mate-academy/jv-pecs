package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {
    private static final List<Truck> trucks = new ArrayList<>();

    {
        trucks.add(new Truck(33, 2));
        trucks.add(new Truck(36.25, 10));
        trucks.add(new Truck(75.02, 25));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
