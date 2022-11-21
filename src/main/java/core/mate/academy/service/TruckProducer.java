package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list = new ArrayList<>();

    public List<Truck> get() {
        list.add(new Truck());
        list.add(new Truck());
        list.add(new Truck());
        return list;
    }
}
