package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> trucks = new ArrayList<>();

    public TruckProducer() {
        this.trucks.add(new Truck(10, 700));
        this.trucks.add(new Truck(20, 1000));
        this.trucks.add(new Truck(40, 1200));
    }

    @Override
    public List<Truck> get() {
        return trucks;
    }
}
