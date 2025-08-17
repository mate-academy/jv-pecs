package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list = new ArrayList<>();

    public TruckProducer() {
        list.add(new Truck(8, 25));
        list.add(new Truck(12, 15));
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
