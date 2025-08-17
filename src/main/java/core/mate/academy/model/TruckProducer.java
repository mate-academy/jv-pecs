package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list;

    public TruckProducer() {
        list = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        list.add(new Truck(3, 130));
        list.add(new Truck(10, 120));
        list.add(new Truck(20, 90));
        return list;
    }
}
