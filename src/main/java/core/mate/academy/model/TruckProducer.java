package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list = new ArrayList<>();

    public TruckProducer() {
        list.add(new Truck("Side Dump Truck"));
    }

    @Override
    public List<Truck> get() {
        return list;
    }
}
