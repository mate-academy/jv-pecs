package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck(900, 80, "TYW"));
        list.add(new Truck());
        list.add(new Truck(40, 90, "AKK"));
        return list;
    }
}
