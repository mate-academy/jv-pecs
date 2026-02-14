package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    public TruckProducer() {
        this.trucks.add(new Truck(3, 32));
        this.trucks.add(new Truck(2, 28));
        this.trucks.add(new Truck(1, 26));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
