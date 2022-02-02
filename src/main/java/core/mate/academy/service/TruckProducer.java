package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> trucks;

    public TruckProducer() {
        trucks = new ArrayList<>();
        trucks.add(new Truck(1000));
        trucks.add(new Truck(3000));
        trucks.add(new Truck(5000));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
