package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final List<Truck> list;

    public TruckProducer() {
        this.list = new ArrayList<>();
        list.add(new Truck(4, 100));
        list.add(new Truck(6, 150));
        list.add(new Truck(8, 200));
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
