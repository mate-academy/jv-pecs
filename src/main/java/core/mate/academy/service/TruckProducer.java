package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        Truck first = new Truck(7, 3);
        Truck second = new Truck(5, 3);
        List<Truck> list = new ArrayList<>();
        list.add(first);
        list.add(second);
        return list;
    }
}
