package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list = new ArrayList<>();

    public TruckProducer() {
        list.add(new Truck(true, 10.55));
        list.add(new Truck(false, 10.10));
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
